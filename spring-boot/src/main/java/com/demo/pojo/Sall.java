package com.demo.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@TableName("S_all")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true )
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sall implements Serializable{
	private static final long serialVersionUID = 1L;
	@TableId(type=IdType.AUTO)
	private Integer DID;
	private String TBLENNAME;
	private String TBLCHNAME;
	private int TBLATTR;
	private int TBLTYPE;
	private String FIELDTBL;
	private String BZ;
	public Integer getDID() {
		return DID;
	}
	public void setDID(Integer dID) {
		DID = dID;
	}
	public String getTBLENNAME() {
		return TBLENNAME;
	}
	public void setTBLENNAME(String tBLENNAME) {
		TBLENNAME = tBLENNAME;
	}
	public String getTBLCHNAME() {
		return TBLCHNAME;
	}
	public void setTBLCHNAME(String tBLCHNAME) {
		TBLCHNAME = tBLCHNAME;
	}
	public int getTBLATTR() {
		return TBLATTR;
	}
	public void setTBLATTR(int tBLATTR) {
		TBLATTR = tBLATTR;
	}
	public int getTBLTYPE() {
		return TBLTYPE;
	}
	public void setTBLTYPE(int tBLTYPE) {
		TBLTYPE = tBLTYPE;
	}
	public String getFIELDTBL() {
		return FIELDTBL;
	}
	public void setFIELDTBL(String fIELDTBL) {
		FIELDTBL = fIELDTBL;
	}
	public String getBZ() {
		return BZ;
	}
	public void setBZ(String bZ) {
		BZ = bZ;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Sall [DID=" + DID + ", TBLENNAME=" + TBLENNAME + ", TBLCHNAME=" + TBLCHNAME + ", TBLATTR=" + TBLATTR
				+ ", TBLTYPE=" + TBLTYPE + ", FIELDTBL=" + FIELDTBL + ", BZ=" + BZ + "]";
	}
	
}
