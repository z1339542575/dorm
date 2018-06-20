package com.zjx.model;

public class Mend {
	private String dorm_men_mno;
	private String dorm_roo_rno;
	private String dorm_roo_pno;
	private String dorm_men_date;
	private String dorm_men_info;
	private String dorm_men_state;
	public Mend() {
		super();
	}
	public Mend(String dorm_men_mno, String dorm_roo_rno, String dorm_roo_pno,
			String dorm_men_date, String dorm_men_info, String dorm_men_state) {
		super();
		this.dorm_men_mno = dorm_men_mno;
		this.dorm_roo_rno = dorm_roo_rno;
		this.dorm_roo_pno = dorm_roo_pno;
		this.dorm_men_date = dorm_men_date;
		this.dorm_men_info = dorm_men_info;
		this.dorm_men_state = dorm_men_state;
	}
	public String getDorm_men_mno() {
		return dorm_men_mno;
	}
	public void setDorm_men_mno(String dorm_men_mno) {
		this.dorm_men_mno = dorm_men_mno;
	}
	public String getDorm_roo_rno() {
		return dorm_roo_rno;
	}
	public void setDorm_roo_rno(String dorm_roo_rno) {
		this.dorm_roo_rno = dorm_roo_rno;
	}
	public String getDorm_roo_pno() {
		return dorm_roo_pno;
	}
	public void setDorm_roo_pno(String dorm_roo_pno) {
		this.dorm_roo_pno = dorm_roo_pno;
	}
	public String getDorm_men_date() {
		return dorm_men_date;
	}
	public void setDorm_men_date(String dorm_men_date) {
		this.dorm_men_date = dorm_men_date;
	}
	public String getDorm_men_info() {
		return dorm_men_info;
	}
	public void setDorm_men_info(String dorm_men_info) {
		this.dorm_men_info = dorm_men_info;
	}
	public String getDorm_men_state() {
		return dorm_men_state;
	}
	public void setDorm_men_state(String dorm_men_state) {
		this.dorm_men_state = dorm_men_state;
	}
	@Override
	public String toString() {
		return "Mend [dorm_men_mno=" + dorm_men_mno + ", dorm_roo_rno="
				+ dorm_roo_rno + ", dorm_roo_pno=" + dorm_roo_pno
				+ ", dorm_men_date=" + dorm_men_date + ", dorm_men_info="
				+ dorm_men_info + ", dorm_men_state=" + dorm_men_state + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mend other = (Mend) obj;
		if (dorm_men_date == null) {
			if (other.dorm_men_date != null)
				return false;
		} else if (!dorm_men_date.equals(other.dorm_men_date))
			return false;
		if (dorm_men_info == null) {
			if (other.dorm_men_info != null)
				return false;
		} else if (!dorm_men_info.equals(other.dorm_men_info))
			return false;
		if (dorm_men_mno == null) {
			if (other.dorm_men_mno != null)
				return false;
		} else if (!dorm_men_mno.equals(other.dorm_men_mno))
			return false;
		if (dorm_men_state == null) {
			if (other.dorm_men_state != null)
				return false;
		} else if (!dorm_men_state.equals(other.dorm_men_state))
			return false;
		if (dorm_roo_pno == null) {
			if (other.dorm_roo_pno != null)
				return false;
		} else if (!dorm_roo_pno.equals(other.dorm_roo_pno))
			return false;
		if (dorm_roo_rno == null) {
			if (other.dorm_roo_rno != null)
				return false;
		} else if (!dorm_roo_rno.equals(other.dorm_roo_rno))
			return false;
		return true;
	}
	
}
