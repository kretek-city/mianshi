package com.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.jdbc.dao.SallDao;
import com.jdbc.dao.SallDaoImpl;
import com.jdbc.pojo.Sall;
/**  链接与dao层的链接 */
public class SallServiceImpl implements SallService{

	public Connection conn1 = null;
	public ResultSet rs = null;
	public PreparedStatement ps = null;
	boolean b=false;
	SallDao sall = new SallDaoImpl();
 
	@Override
	public List<Sall> queryAllData() {
		// TODO Auto-generated method stub
		return sall.queryAllData();
	}

	@Override
	public boolean insertData(Sall t) {
		if(t!=null){
			sall.insertData(t);
			b=true;
		}
		return b;
	}

	@Override
	public boolean update(Sall t) {
		if(t!=null){
			sall.update(t);
			b=true;
		}
		return b;
	}

	@Override
	public boolean delete(int id) {
		if(id != 0){
			sall.delete(id);
			b=true;
		}
		return b;
	}

	@Override
	public Sall queryDataById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
