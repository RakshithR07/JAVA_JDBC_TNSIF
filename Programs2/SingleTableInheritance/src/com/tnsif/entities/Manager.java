package com.tnsif.entities;
@Entity
@DiscriminatorValue("MGR")
public class Manager extends employee{

	private static final long serialVersionUID=1L;
	
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
