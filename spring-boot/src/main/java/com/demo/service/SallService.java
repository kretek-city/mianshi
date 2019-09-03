package com.demo.service;

import java.util.List;

import com.demo.pojo.Sall;

public interface SallService {

	/** 查询所有的数据 */
	List<Sall> findAll();

	/** 分页查询 */
	List<Sall> findAllFen(int page,int rows);

	/** 新增数据 */
	void insert(Sall sall);

	/** 删除数据 */
	void deletct(int[] ids);

	/** 修改数据 */
	void update(Sall sall);

	Integer findAllZhong();
	
}
