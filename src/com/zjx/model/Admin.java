package com.zjx.model;
/**
 * @ClassName: Admin.java
 * @Description: Admin管理员表的实体类
 *
 * @version: v1.0.0
 * @author: ZHjx
 * @date: 2018-4-16 下午4:02:47 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018-4-16     ZHjx           v1.0.0               修改原因
 */
public class Admin {
	private String dorm_adm_ano;
	private String dorm_adm_name;
	private String dorm_adm_sex;
	private String dorm_adm_password;
	private String dorm_adm_state;
	public Admin() {
		super();
	}
	public Admin(String dorm_adm_ano, String dorm_adm_name, String dorm_adm_sex,
			String dorm_adm_password, String dorm_adm_state) {
		super();
		this.dorm_adm_ano = dorm_adm_ano;
		this.dorm_adm_name = dorm_adm_name;
		this.dorm_adm_sex = dorm_adm_sex;
		this.dorm_adm_password = dorm_adm_password;
		this.dorm_adm_state = dorm_adm_state;
	}
	public String getDorm_adm_ano() {
		return dorm_adm_ano;
	}
	public void setDorm_adm_ano(String dorm_adm_ano) {
		this.dorm_adm_ano = dorm_adm_ano;
	}
	public String getDorm_adm_name() {
		return dorm_adm_name;
	}
	public void setDorm_adm_name(String dorm_adm_name) {
		this.dorm_adm_name = dorm_adm_name;
	}
	public String getDorm_adm_sex() {
		return dorm_adm_sex;
	}
	public void setDorm_adm_sex(String dorm_adm_sex) {
		this.dorm_adm_sex = dorm_adm_sex;
	}
	public String getDorm_adm_password() {
		return dorm_adm_password;
	}
	public void setDorm_adm_password(String dorm_adm_password) {
		this.dorm_adm_password = dorm_adm_password;
	}
	public String getDorm_adm_state() {
		return dorm_adm_state;
	}
	public void setDorm_adm_state(String dorm_adm_state) {
		this.dorm_adm_state = dorm_adm_state;
	}
	@Override
	public String toString() {
		return "Admin [dorm_adm_ano=" + dorm_adm_ano + ", dorm_adm_name="
				+ dorm_adm_name + ", dorm_adm_sex=" + dorm_adm_sex
				+ ", dorm_adm_password=" + dorm_adm_password
				+ ", dorm_adm_state=" + dorm_adm_state + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (dorm_adm_ano != other.dorm_adm_ano)
			return false;
		if (dorm_adm_name == null) {
			if (other.dorm_adm_name != null)
				return false;
		} else if (!dorm_adm_name.equals(other.dorm_adm_name))
			return false;
		if (dorm_adm_password == null) {
			if (other.dorm_adm_password != null)
				return false;
		} else if (!dorm_adm_password.equals(other.dorm_adm_password))
			return false;
		if (dorm_adm_sex == null) {
			if (other.dorm_adm_sex != null)
				return false;
		} else if (!dorm_adm_sex.equals(other.dorm_adm_sex))
			return false;
		if (dorm_adm_state != other.dorm_adm_state)
			return false;
		return true;
	} 
	
	
}
