package com.zjx.model;
/**
 * @ClassName: Student.java
 * @Description: Student学生表的实体类
 *
 * @version: v1.0.0
 * @author: ZHjx
 * @date: 2018-4-16 下午4:02:16 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018-4-16     ZHjx           v1.0.0               修改原因
 */
public class Student {
	private String dorm_stu_sno;
	private String dorm_stu_cno;
	private String dorm_stu_name;
	private String dorm_stu_sex;
	private String dorm_roo_rno;
	private String dorm_stu_specialty;
	private String dorm_stu_password;
	private String dorm_stu_state;
	public Student() {
		super();
	}
	public Student(String dorm_stu_sno, String dorm_stu_cno, String dorm_stu_name,
			String dorm_stu_sex, String dorm_roo_rno,
			String dorm_stu_specialty, String dorm_stu_password,
			String dorm_stu_state) {
		super();
		this.dorm_stu_sno = dorm_stu_sno;
		this.dorm_stu_cno = dorm_stu_cno;
		this.dorm_stu_name = dorm_stu_name;
		this.dorm_stu_sex = dorm_stu_sex;
		this.dorm_roo_rno = dorm_roo_rno;
		this.dorm_stu_specialty = dorm_stu_specialty;
		this.dorm_stu_password = dorm_stu_password;
		this.dorm_stu_state = dorm_stu_state;
	}
	public String getDorm_stu_sno() {
		return dorm_stu_sno;
	}
	public void setDorm_stu_sno(String dorm_stu_sno) {
		this.dorm_stu_sno = dorm_stu_sno;
	}
	public String getDorm_stu_cno() {
		return dorm_stu_cno;
	}
	public void setDorm_stu_cno(String dorm_stu_cno) {
		this.dorm_stu_cno = dorm_stu_cno;
	}
	public String getDorm_stu_name() {
		return dorm_stu_name;
	}
	public void setDorm_stu_name(String dorm_stu_name) {
		this.dorm_stu_name = dorm_stu_name;
	}
	public String getDorm_stu_sex() {
		return dorm_stu_sex;
	}
	public void setDorm_stu_sex(String dorm_stu_sex) {
		this.dorm_stu_sex = dorm_stu_sex;
	}
	public String getDorm_roo_rno() {
		return dorm_roo_rno;
	}
	public void setDorm_roo_rno(String dorm_roo_rno) {
		this.dorm_roo_rno = dorm_roo_rno;
	}
	public String getDorm_stu_specialty() {
		return dorm_stu_specialty;
	}
	public void setDorm_stu_specialty(String dorm_stu_specialty) {
		this.dorm_stu_specialty = dorm_stu_specialty;
	}
	public String getDorm_stu_password() {
		return dorm_stu_password;
	}
	public void setDorm_stu_password(String dorm_stu_password) {
		this.dorm_stu_password = dorm_stu_password;
	}
	public String getDorm_stu_state() {
		return dorm_stu_state;
	}
	public void setDorm_stu_state(String dorm_stu_state) {
		this.dorm_stu_state = dorm_stu_state;
	}
	@Override
	public String toString() {
		return "Student [dorm_stu_sno=" + dorm_stu_sno + ", dorm_stu_cno="
				+ dorm_stu_cno + ", dorm_stu_name=" + dorm_stu_name
				+ ", dorm_stu_sex=" + dorm_stu_sex + ", dorm_roo_rno="
				+ dorm_roo_rno + ", dorm_stu_specialty=" + dorm_stu_specialty
				+ ", dorm_stu_password=" + dorm_stu_password
				+ ", dorm_stu_state=" + dorm_stu_state + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (dorm_roo_rno == null) {
			if (other.dorm_roo_rno != null)
				return false;
		} else if (!dorm_roo_rno.equals(other.dorm_roo_rno))
			return false;
		if (dorm_stu_cno != other.dorm_stu_cno)
			return false;
		if (dorm_stu_name == null) {
			if (other.dorm_stu_name != null)
				return false;
		} else if (!dorm_stu_name.equals(other.dorm_stu_name))
			return false;
		if (dorm_stu_password == null) {
			if (other.dorm_stu_password != null)
				return false;
		} else if (!dorm_stu_password.equals(other.dorm_stu_password))
			return false;
		if (dorm_stu_sex == null) {
			if (other.dorm_stu_sex != null)
				return false;
		} else if (!dorm_stu_sex.equals(other.dorm_stu_sex))
			return false;
		if (dorm_stu_sno != other.dorm_stu_sno)
			return false;
		if (dorm_stu_specialty == null) {
			if (other.dorm_stu_specialty != null)
				return false;
		} else if (!dorm_stu_specialty.equals(other.dorm_stu_specialty))
			return false;
		if (dorm_stu_state != other.dorm_stu_state)
			return false;
		return true;
	}
	
	

}
