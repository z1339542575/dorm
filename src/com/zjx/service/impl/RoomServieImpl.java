package com.zjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjx.dao.RoomDao;
import com.zjx.model.Room;
import com.zjx.service.RoomService;

@Service("roomService")
public class RoomServieImpl implements RoomService {
	@Autowired
	private RoomDao  roomDao;
	public RoomDao getRoomDao() {
		return roomDao;
	}
	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

	@Override
	public String addInfo(Room room) {
		//String dorm_roo_xno = addInfo.getDorm_roo_xno();
		//Room room = roomDao.selectByPrimaryKey(dorm_roo_xno);
		//if(room == null){
			if(roomDao.insertSelective(room) == 1){
				return "succeed";
			}else
				return "fail";
		//}else{
		//	return "exist";
		//}
	}

	@Override
	public List<Room> getAll() {
		List<Room> list = roomDao.getAll();
		return list;
	}

	@Override
	public String delete(String dorm_roo_rno) {
		if (roomDao.deleteByPrimaryKey(dorm_roo_rno) == 1) {  
            return "succeed";
        }  
        return "fail";
	}
	
	@Override
	public Room findById(String dorm_roo_xno) {
		return roomDao.selectByPrimaryKey(dorm_roo_xno);
	}
	
	@Override
	public List<Room> findByRno(String dorm_roo_rno) {
		return roomDao.selectByRno(dorm_roo_rno);
	}

	@Override
	public List<Room> findByPno(String dorm_roo_pno) {
		return roomDao.selectByPno(dorm_roo_pno);
	}

	@Override
	public String update(Room updateInfo) {
		if (roomDao.updateByPrimaryKeySelective(updateInfo) == 1) {
			return "succeed";
        }
		return "fail";
	}

}
