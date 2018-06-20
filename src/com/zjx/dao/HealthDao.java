package com.zjx.dao;

import java.util.List;

import com.zjx.model.Health;

public interface HealthDao {
	/**
	 * @Function: HealthDao.java
	 * @Description: 添加学生
	 *
	 * @param: Health hea
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:05:36
	 */
	int insert(Health hea);
	/**
	 * @Function: HealthDao.java
	 * @Description: 添加学生信息
	 *
	 * @param: Health hea
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:04:39
	 */
    int insertSelective(Health hea);
    /**
     * @Function: HealthDao.java
     * @Description: 根据主键删除信息(物理删除)
     *
     * @param:String dorm_hea_hno
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:04:28
     */
    int deleteByPrimaryKey(String dorm_hea_hno);
    /**
     * @Function: HealthDao.java
     * @Description: 更新数据（）
     *
     * @param:Health hea
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:47
     */
    int updateByPrimaryKeySelective(Health hea);
    /**
     * @Function: HealthDao.java
     * @Description: 更新数据
     *
     * @param:Health hea
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:52
     */
    int updateByPrimaryKey(Health hea);
    /**
     * @Function: HealthDao.java
     * @Description: 根据主键查询单挑数据
     *
     * @param:String dorm_hea_hno
     * @return：Health
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:56
     */
    Health selectByPrimaryKey(String dorm_hea_hno);
    /**
     * @Function: HealthDao.java
     * @Description: 根据dorm_roo_rno查询数据
     *
     * @param:String dorm_roo_rno
     * @return：List<Health>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:56
     */
    List<Health> selectByRno(String dorm_roo_rno);

    /**
     * @Function: HealthDao.java
     * @Description: 获取所有学生信息
     *
     * @param:null
     * @return：List<Health>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:06:00
     */
    List<Health> getAll();

}