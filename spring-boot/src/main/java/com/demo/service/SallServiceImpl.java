package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.SallMapper;
import com.demo.pojo.Sall;

@Service
public class SallServiceImpl implements SallService{

	@Autowired
	private SallMapper sallMapper;
	
	/** 查询所有的数据 */
	@Override
	public List<Sall> findAll() {
		
		return sallMapper.findAll();
	}

	/** 分页查询 */
	@Override
	public List<Sall> findAllFen(int page,int rows) {
		int ids = (page - 1) * rows; 
		System.out.println("ids:"+ids+"rows:"+rows);
		List<Sall> list = sallMapper.findAllFen(ids,rows);
		return list;
	}
	
	@Override
	public Integer findAllZhong() {
		Integer total = sallMapper.findAllZhong();
		return total;
	}
	
	/** 新增数据 */
	@Override
	public void insert(Sall sall) {
		try {
			sallMapper.insert(sall);
		} catch (Exception e) {
			throw new IllegalAccessError("失败");
		}
	}
	
	/** 删除数据 */
	@Override
	public void deletct(int[] ids) {
		try {
			for(int id : ids) {
				sallMapper.delect(id);
			}
		} catch (Exception e) {
			throw new IllegalAccessError("失败");
		}
	}
	
	/** 修改数据 */
	@Override
	public void update(Sall sall) {
		try {
			sallMapper.update(sall);
		} catch (Exception e) {
			throw new IllegalAccessError("失败");
		}
	}
}
