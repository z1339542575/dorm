package com.zjx.service;

import java.util.List;

import com.zjx.model.Room;

public interface RoomService {
	/**
	 * @Function: RoomService.java
	 * @Description: 添加数据
	 *
	 * @param:Room addInfo
	 * @return：String
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:58:09
	 */
    String addInfo(Room room);
    /**
     * @Function: RoomService.java
     * @Description: 获取所有数据
     *
     * @param:null
     * @return：List<Room>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午5:52:05
     */
    List<Room> getAll();
    /**
     * @Function: RoomService.java
     * @Description: 按房号删除
     *
     * @param:String dorm_roo_rno
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:26
     */
    String delete(String dorm_roo_rno);
    /**
     * @Function: RoomService.java
     * @Description: 按序号查询单挑数据
     *
     * @param:String dorm_roo_xno
     * @return：Room
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    Room findById(String dorm_roo_xno);
    /**
     * @Function: RoomService.java
     * @Description: 按房号查询
     *
     * @param:String dorm_adm_ano
     * @return：List<Room>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    List<Room> findByRno(String dorm_roo_rno);
    /**
     * @Function: RoomService.java
     * @Description: 按楼号查询
     *
     * @param:String dorm_roo_pno
     * @return：List<Room>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-27 下午4:27:39
     */
    List<Room> findByPno(String dorm_roo_pno);
    /**
     * @Function: RoomService.java
     * @Description: 更新数据
     *
     * @param:Room updateInfo
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:33
     */
    String update(Room updateInfo);
}