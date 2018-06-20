package com.zjx.dao;

import java.util.List;

import com.zjx.model.Room;

public interface RoomDao {
	/**
	 * @Function: RoomDao.java
	 * @Description: 添加学生
	 *
	 * @param: Room room
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:05:36
	 */
	int insert(Room room);
	/**
	 * @Function: RoomDao.java
	 * @Description: 添加学生信息
	 *
	 * @param: Room room
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:04:39
	 */
    int insertSelective(Room room);
    /**
     * @Function: RoomDao.java
     * @Description: 根据主键删除信息(物理删除)
     *
     * @param:String dorm_roo_rno
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:04:28
     */
    int deleteByPrimaryKey(String dorm_roo_rno);
    /**
     * @Function: RoomDao.java
     * @Description: 更新数据（）
     *
     * @param:Room room
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:47
     */
    int updateByPrimaryKeySelective(Room room);
    /**
     * @Function: RoomDao.java
     * @Description: 更新数据
     *
     * @param:Room room
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:52
     */
    int updateByPrimaryKey(Room room);
    /**
     * @Function: AdminDao.java
     * @Description: 根据主键查询单挑数据
     *
     * @param:String dorm_roo_xno
     * @return：Room
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:56
     */
    Room selectByPrimaryKey(String dorm_roo_xno);
    /**
     * @Function: AdminDao.java
     * @Description: 根据dorm_roo_rno查询单挑数据
     *
     * @param:String dorm_roo_rno
     * @return：List<Room>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:56
     */
    List<Room> selectByRno(String dorm_roo_rno);
    /**
     * @Function: RoomDao.java
     * @Description: 根据dorm_roo_pno查询单挑数据
     *
     * @param:String dorm_roo_pno
     * @return：List<Room>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-27 下午4:23:53
     */
    List<Room> selectByPno(String dorm_roo_pno);
    /**
     * @Function: RoomDao.java
     * @Description: 获取所有学生信息
     *
     * @param:null
     * @return：List<Room>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:06:00
     */
    List<Room> getAll();

}