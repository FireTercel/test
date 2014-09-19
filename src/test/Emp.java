package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp {

	private int empNo;

	private String name;
	private String phone;

	private String dept;

	private Date hireDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return empNo + "," + name + "," + phone + ","
				+ new SimpleDateFormat("yyy-MM-dd").format(hireDate)+","+dept;
	}

}
