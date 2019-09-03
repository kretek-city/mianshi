package com.jdbc.pojo;

public class Sall {
	
	private Integer DID;
	private String TBLENNAME;
	private String TBLCHNAME;
	private Integer TBLATTR;
	private Integer TBLTYPE;
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
	public Integer getTBLATTR() {
		return TBLATTR;
	}
	public void setTBLATTR(Integer tBLATTR) {
		TBLATTR = tBLATTR;
	}
	public Integer getTBLTYPE() {
		return TBLTYPE;
	}
	public void setTBLTYPE(Integer tBLTYPE) {
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
	@Override
	public String toString() {
		return "Sall [DID=" + DID + ", TBLENNAME=" + TBLENNAME + ", TBLCHNAME=" + TBLCHNAME + ", TBLATTR=" + TBLATTR
				+ ", TBLTYPE=" + TBLTYPE + ", FIELDTBL=" + FIELDTBL + ", BZ=" + BZ + "]";
	}
	
}
