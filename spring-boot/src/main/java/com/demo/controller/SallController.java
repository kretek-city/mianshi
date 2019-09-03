package com.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.pojo.Sall;
import com.demo.service.SallService;
import com.demo.vo.Table;

@Controller
public class SallController {
	
	@Autowired
	private SallService sallservice;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	/** 查询所有的数据 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Sall> findAll(){
		return sallservice.findAll();
	}
	
	/** 分页查询 */
	@RequestMapping("/findAllFen")
	@ResponseBody
	public Table findAllFen(int page,int rows){
		List<Sall> list = sallservice.findAllFen(page,rows);
		Integer total = sallservice.findAllZhong();
		return new Table(total,list);
	}
	
	/** 新增数据 */
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(Sall sall) {
		try {
			sallservice.insert(sall);
		} catch (Exception e) {
			return "添加失败";
		}
		return "添加成功";
	}
	
	/** 删除数据 */
	@RequestMapping("/delete")
	@ResponseBody
	public String delect(int[] ids) {
		System.out.println("进入到delete了");
		System.out.println(ids);
		try {
			sallservice.deletct(ids);
		} catch (Exception e) {
			return "删除失败";
		}
		return "删除成功";
	}
	
	/** 修改数据 */
	@RequestMapping("/update")
	@ResponseBody
	public String update(Sall sall) {
		try {
			sallservice.update(sall);
		} catch (Exception e) {
			return "修改失败";
		}
		return "修改成功";
	}
}
