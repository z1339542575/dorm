package com.zjx.model;

public class Lose {
	private String dorm_lose_lno;
	private String dorm_lose_info;
	private String dorm_lose_name;
	private String dorm_lose_date;
	private String dorm_lose_addr;
	private String dorm_lose_state;
	public Lose() {
		super();
	}
	public Lose(String dorm_lose_lno, String dorm_lose_info,
			String dorm_lose_name, String dorm_lose_date, String dorm_lose_addr,
			String dorm_lose_state) {
		super();
		this.dorm_lose_lno = dorm_lose_lno;
		this.dorm_lose_info = dorm_lose_info;
		this.dorm_lose_name = dorm_lose_name;
		this.dorm_lose_date = dorm_lose_date;
		this.dorm_lose_addr = dorm_lose_addr;
		this.dorm_lose_state = dorm_lose_state;
	}
	public String getDorm_lose_lno() {
		return dorm_lose_lno;
	}
	public void setDorm_lose_lno(String dorm_lose_lno) {
		this.dorm_lose_lno = dorm_lose_lno;
	}
	public String getDorm_lose_info() {
		return dorm_lose_info;
	}
	public void setDorm_lose_info(String dorm_lose_info) {
		this.dorm_lose_info = dorm_lose_info;
	}
	public String getDorm_lose_name() {
		return dorm_lose_name;
	}
	public void setDorm_lose_name(String dorm_lose_name) {
		this.dorm_lose_name = dorm_lose_name;
	}
	public String getDorm_lose_date() {
		return dorm_lose_date;
	}
	public void setDorm_lose_date(String dorm_lose_date) {
		this.dorm_lose_date = dorm_lose_date;
	}
	public String getDorm_lose_addr() {
		return dorm_lose_addr;
	}
	public void setDorm_lose_addr(String dorm_lose_addr) {
		this.dorm_lose_addr = dorm_lose_addr;
	}
	public String getDorm_lose_state() {
		return dorm_lose_state;
	}
	public void setDorm_lose_state(String dorm_lose_state) {
		this.dorm_lose_state = dorm_lose_state;
	}
	@Override
	public String toString() {
		return "Lose [dorm_lose_lno=" + dorm_lose_lno + ", dorm_lose_info="
				+ dorm_lose_info + ", dorm_lose_name=" + dorm_lose_name
				+ ", dorm_lose_date=" + dorm_lose_date + ", dorm_lose_addr="
				+ dorm_lose_addr + ", dorm_lose_state=" + dorm_lose_state + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lose other = (Lose) obj;
		if (dorm_lose_addr == null) {
			if (other.dorm_lose_addr != null)
				return false;
		} else if (!dorm_lose_addr.equals(other.dorm_lose_addr))
			return false;
		if (dorm_lose_date == null) {
			if (other.dorm_lose_date != null)
				return false;
		} else if (!dorm_lose_date.equals(other.dorm_lose_date))
			return false;
		if (dorm_lose_info == null) {
			if (other.dorm_lose_info != null)
				return false;
		} else if (!dorm_lose_info.equals(other.dorm_lose_info))
			return false;
		if (dorm_lose_lno == null) {
			if (other.dorm_lose_lno != null)
				return false;
		} else if (!dorm_lose_lno.equals(other.dorm_lose_lno))
			return false;
		if (dorm_lose_name == null) {
			if (other.dorm_lose_name != null)
				return false;
		} else if (!dorm_lose_name.equals(other.dorm_lose_name))
			return false;
		if (dorm_lose_state == null) {
			if (other.dorm_lose_state != null)
				return false;
		} else if (!dorm_lose_state.equals(other.dorm_lose_state))
			return false;
		return true;
	}
	
}
