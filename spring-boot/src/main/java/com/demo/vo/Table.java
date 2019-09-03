package com.demo.vo;

import java.util.List;

import com.demo.pojo.Sall;

public class Table {
	
	public Table(Integer total, List<Sall> list) {
		this.total = total;
		this.rows = list;
	}
	private Integer total;
	private List<Sall> rows;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<Sall> getRows() {
		return rows;
	}
	public void setRows(List<Sall> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "Table [total=" + total + ", rows=" + rows + "]";
	}
	
}
