package com.zjx.model;

public class Health {
	private String dorm_hea_hno;
	private String dorm_roo_rno;
	private String dorm_roo_pno;
	private String dorm_hea_date;
	private String dorm_hea_score;
	private String dorm_hea_remarks;
	public Health() {
		super();
	}
	public Health(String dorm_hea_hno, String dorm_roo_rno,
			String dorm_roo_pno, String dorm_hea_date, String dorm_hea_score,
			String dorm_hea_remarks) {
		super();
		this.dorm_hea_hno = dorm_hea_hno;
		this.dorm_roo_rno = dorm_roo_rno;
		this.dorm_roo_pno = dorm_roo_pno;
		this.dorm_hea_date = dorm_hea_date;
		this.dorm_hea_score = dorm_hea_score;
		this.dorm_hea_remarks = dorm_hea_remarks;
	}
	public String getDorm_hea_hno() {
		return dorm_hea_hno;
	}
	public void setDorm_hea_hno(String dorm_hea_hno) {
		this.dorm_hea_hno = dorm_hea_hno;
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
	public String getDorm_hea_date() {
		return dorm_hea_date;
	}
	public void setDorm_hea_date(String dorm_hea_date) {
		this.dorm_hea_date = dorm_hea_date;
	}
	public String getDorm_hea_score() {
		return dorm_hea_score;
	}
	public void setDorm_hea_score(String dorm_hea_score) {
		this.dorm_hea_score = dorm_hea_score;
	}
	public String getDorm_hea_remarks() {
		return dorm_hea_remarks;
	}
	public void setDorm_hea_remarks(String dorm_hea_remarks) {
		this.dorm_hea_remarks = dorm_hea_remarks;
	}
	@Override
	public String toString() {
		return "Health [dorm_hea_hno=" + dorm_hea_hno + ", dorm_roo_rno="
				+ dorm_roo_rno + ", dorm_roo_pno=" + dorm_roo_pno
				+ ", dorm_hea_date=" + dorm_hea_date + ", dorm_hea_score="
				+ dorm_hea_score + ", dorm_hea_remarks=" + dorm_hea_remarks
				+ "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Health other = (Health) obj;
		if (dorm_hea_date == null) {
			if (other.dorm_hea_date != null)
				return false;
		} else if (!dorm_hea_date.equals(other.dorm_hea_date))
			return false;
		if (dorm_hea_hno == null) {
			if (other.dorm_hea_hno != null)
				return false;
		} else if (!dorm_hea_hno.equals(other.dorm_hea_hno))
			return false;
		if (dorm_hea_remarks == null) {
			if (other.dorm_hea_remarks != null)
				return false;
		} else if (!dorm_hea_remarks.equals(other.dorm_hea_remarks))
			return false;
		if (dorm_hea_score == null) {
			if (other.dorm_hea_score != null)
				return false;
		} else if (!dorm_hea_score.equals(other.dorm_hea_score))
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
