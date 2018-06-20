package com.zjx.model;
/**
 * @ClassName: Room.java
 * @Description: Room房间表的pojo
 *
 * @version: v1.0.0
 * @author: ZHjx
 * @date: 2018-4-16 下午4:03:03 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018-4-16     ZHjx           v1.0.0               修改原因
 */
public class Room {
	private String dorm_roo_xno;
	private String dorm_roo_rno;
	private String dorm_roo_pno;
	private String dorm_roo_bnum;
	public Room() {
		super();
	}
	public Room(String dorm_roo_xno, String dorm_roo_rno, String dorm_roo_pno,
			String dorm_roo_bnum) {
		super();
		this.dorm_roo_xno = dorm_roo_xno;
		this.dorm_roo_rno = dorm_roo_rno;
		this.dorm_roo_pno = dorm_roo_pno;
		this.dorm_roo_bnum = dorm_roo_bnum;
	}
	public String getDorm_roo_xno() {
		return dorm_roo_xno;
	}
	public void setDorm_roo_xno(String dorm_roo_xno) {
		this.dorm_roo_xno = dorm_roo_xno;
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
	public String getDorm_roo_bnum() {
		return dorm_roo_bnum;
	}
	public void setDorm_roo_bnum(String dorm_roo_bnum) {
		this.dorm_roo_bnum = dorm_roo_bnum;
	}
	@Override
	public String toString() {
		return "Room [dorm_roo_xno=" + dorm_roo_xno + ", dorm_roo_rno="
				+ dorm_roo_rno + ", dorm_roo_pno=" + dorm_roo_pno
				+ ", dorm_roo_bnum=" + dorm_roo_bnum + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (dorm_roo_bnum != other.dorm_roo_bnum)
			return false;
		if (dorm_roo_pno != other.dorm_roo_pno)
			return false;
		if (dorm_roo_rno == null) {
			if (other.dorm_roo_rno != null)
				return false;
		} else if (!dorm_roo_rno.equals(other.dorm_roo_rno))
			return false;
		if (dorm_roo_xno != other.dorm_roo_xno)
			return false;
		return true;
	}
	
}
