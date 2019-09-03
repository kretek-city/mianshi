package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.pojo.Sall;
import com.jdbc.unit.UnitMysql;

public class SallDaoImpl implements SallDao{

	public Connection conn1 = null;
	public ResultSet rs = null;
	public PreparedStatement ps = null;
	private Connection coon1;
	
	// 查询所有的数据
	@Override
	public List<Sall> queryAllData() {
		//链接数据库
		conn1 = UnitMysql.getConnection();
		List<Sall> list = new ArrayList<>();
		try {
			String sqlSelect = "select * from S_all";
			ps = conn1.prepareStatement(sqlSelect);
			rs = ps.executeQuery();
			Sall user = null;
			while(rs.next()){
				user.setBZ(rs.getString("BZ"));
				user.setDID(rs.getInt("DID"));
				user.setFIELDTBL(rs.getString("FIELDTBL"));
				user.setTBLATTR(rs.getInt("TBLATTR"));
				user.setTBLCHNAME(rs.getString("TBLCHNAME"));
				user.setTBLENNAME(rs.getString("TBLENNAME"));
				user.setTBLTYPE(rs.getInt("TBLTYPE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			UnitMysql.Close(rs, ps, conn1);
		}
		return list;
	}

	@Override
	public int insertData(Sall t) {
		conn1 = UnitMysql.getConnection();
		int i = 0;
		try {
			String sqlInsert = "insert into S_all(BZ,FIELDTBL,TBLATTR,TBLCHNAME,TBLENNAME,TBLTYPE) values(?,?,?,?,?,?) ;";
			ps = conn1.prepareStatement(sqlInsert,PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, t.getBZ());
			ps.setString(2, t.getFIELDTBL());
			ps.setInt(3, t.getTBLATTR());
			ps.setString(4, t.getTBLCHNAME());
			ps.setString(6, t.getTBLENNAME());
			ps.setInt(6, t.getTBLTYPE());
			// 得到 最新的 ID
			rs = ps.getGeneratedKeys();
			if (rs.next()) {// 是否存在
				i = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			UnitMysql.Close(rs, ps, conn1);
		}
		return i;
	}

	@Override
	public int update(Sall t) {
		conn1 = UnitMysql.getConnection();
		int i = 0;
		try {
			String sqlUpdate = "update S_all set BZ=?, FIELDTBL =? ,TBLATTR=? ,TBLCHNAME=? ,TBLENNAME=? ,TBLTYPE=? where DID=?";
			ps = conn1.prepareStatement(sqlUpdate);
			ps.setString(1, t.getBZ());
			ps.setString(2, t.getFIELDTBL());
			ps.setInt(3, t.getTBLATTR());
			ps.setString(4, t.getTBLCHNAME());
			ps.setString(6, t.getTBLENNAME());
			ps.setInt(6, t.getTBLTYPE());
			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			UnitMysql.Close(rs, ps, conn1);
		}
		return i;
	}

	@Override
	public int delete(int id) {
		 conn1 = UnitMysql.getConnection();
		int i = 0;
		try {
			 String sqlDelete = "delete from users where id=?";
			 ps = conn1.prepareStatement(sqlDelete);
			 ps.setInt(1, id);
			 i = ps.executeUpdate();
			 if (i == 1) {
				 return i;
			 }
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			UnitMysql.Close(rs, ps, conn1);
		}
		return i;
	}

	@Override
	public Sall queryDataById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
