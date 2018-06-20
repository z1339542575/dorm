package com.zjx.model;

/**
 * @ClassName: Visitor.java
 * @Description: Visitor访客表的pojo
 *
 * @version: v1.0.0
 * @author: ZHjx
 * @date: 2018-4-16 下午4:04:06 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018-4-16     ZHjx           v1.0.0               修改原因
 */
public class Visitor {
	private String dorm_vis_vno;
	private String dorm_vis_name;
	private String dorm_vis_sex;
	private String dorm_vis_date;
	private String dorm_roo_pno;
	private String dorm_vis_remarks;
	public Visitor() {
		super();
	}
	public Visitor(String dorm_vis_vno, String dorm_vis_name,
			String dorm_vis_sex, String dorm_vis_date, String dorm_roo_pno,
			String dorm_vis_remarks) {
		super();
		this.dorm_vis_vno = dorm_vis_vno;
		this.dorm_vis_name = dorm_vis_name;
		this.dorm_vis_sex = dorm_vis_sex;
		this.dorm_vis_date = dorm_vis_date;
		this.dorm_roo_pno = dorm_roo_pno;
		this.dorm_vis_remarks = dorm_vis_remarks;
	}
	public String getDorm_vis_vno() {
		return dorm_vis_vno;
	}
	public void setDorm_vis_vno(String dorm_vis_vno) {
		this.dorm_vis_vno = dorm_vis_vno;
	}
	public String getDorm_vis_name() {
		return dorm_vis_name;
	}
	public void setDorm_vis_name(String dorm_vis_name) {
		this.dorm_vis_name = dorm_vis_name;
	}
	public String getDorm_vis_sex() {
		return dorm_vis_sex;
	}
	public void setDorm_vis_sex(String dorm_vis_sex) {
		this.dorm_vis_sex = dorm_vis_sex;
	}
	public String getDorm_vis_date() {
		return dorm_vis_date;
	}
	public void setDorm_vis_date(String dorm_vis_date) {
		this.dorm_vis_date = dorm_vis_date;
	}
	public String getDorm_roo_pno() {
		return dorm_roo_pno;
	}
	public void setDorm_roo_pno(String dorm_roo_pno) {
		this.dorm_roo_pno = dorm_roo_pno;
	}
	public String getDorm_vis_remarks() {
		return dorm_vis_remarks;
	}
	public void setDorm_vis_remarks(String dorm_vis_remarks) {
		this.dorm_vis_remarks = dorm_vis_remarks;
	}
	@Override
	public String toString() {
		return "Visitor [dorm_vis_vno=" + dorm_vis_vno + ", dorm_vis_name="
				+ dorm_vis_name + ", dorm_vis_sex=" + dorm_vis_sex
				+ ", dorm_vis_date=" + dorm_vis_date + ", dorm_roo_pno="
				+ dorm_roo_pno + ", dorm_vis_remarks=" + dorm_vis_remarks + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Visitor other = (Visitor) obj;
		if (dorm_roo_pno == null) {
			if (other.dorm_roo_pno != null)
				return false;
		} else if (!dorm_roo_pno.equals(other.dorm_roo_pno))
			return false;
		if (dorm_vis_date == null) {
			if (other.dorm_vis_date != null)
				return false;
		} else if (!dorm_vis_date.equals(other.dorm_vis_date))
			return false;
		if (dorm_vis_name == null) {
			if (other.dorm_vis_name != null)
				return false;
		} else if (!dorm_vis_name.equals(other.dorm_vis_name))
			return false;
		if (dorm_vis_remarks == null) {
			if (other.dorm_vis_remarks != null)
				return false;
		} else if (!dorm_vis_remarks.equals(other.dorm_vis_remarks))
			return false;
		if (dorm_vis_sex == null) {
			if (other.dorm_vis_sex != null)
				return false;
		} else if (!dorm_vis_sex.equals(other.dorm_vis_sex))
			return false;
		if (dorm_vis_vno == null) {
			if (other.dorm_vis_vno != null)
				return false;
		} else if (!dorm_vis_vno.equals(other.dorm_vis_vno))
			return false;
		return true;
	}
	
	
}
