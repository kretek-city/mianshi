package com.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.demo.pojo.Sall;
@Mapper
public interface SallMapper {
	
	/** 查询所有的数据 */
	@Select("select * from S_all")
	List<Sall> findAll();

	/** 分页查询 */
	@Select("select * from S_all limit #{ids},#{sum}")
	List<Sall> findAllFen(int ids,int sum);

	/** 总记录数 */
	@Select("select count(*) from S_all")
	Integer findAllZhong();

	/** 新增数据 */
	@Insert("insert into S_all values(#{sall.DID},#{sall.TBLENNAME},#{sall.TBLCHNAME},#{sall.TBLATTR},#{sall.TBLTYPE},#{sall.FIELDTBL},#{sall.BZ})")
	void insert(@Param("sall") Sall sall);

	/** 删除数据 */
	@Delete("delete from S_all where DID=#{id}")
	void delect(int id);
	
	/** 修改数据 */
	@Update("update S_all set TBLENNAME=#{sall.TBLENNAME},TBLCHNAME=#{sall.TBLCHNAME},TBLATTR=#{sall.TBLATTR},TBLTYPE=#{sall.TBLTYPE},FIELDTBL=#{sall.FIELDTBL},BZ=#{sall.BZ} where DID=#{sall.DID}")
	void update(@Param("sall")Sall sall);


}
