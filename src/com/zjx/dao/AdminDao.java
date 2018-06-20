package com.zjx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zjx.model.Admin;

public interface AdminDao {
	/**
	 * @Function: AdminDao.java
	 * @Description: 添加管理员
	 *
	 * @param: Admin adm
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:05:36
	 */
	int insert(Admin adm);
	/**
	 * @Function: AdminDao.java
	 * @Description: 添加管理员信息
	 *
	 * @param: Admin adm
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:04:39
	 */
    int insertSelective(Admin adm);
    /**
     * @Function: AdminDao.java
     * @Description: 根据主键删除信息(物理删除)
     *
     * @param:String dorm_stu_sno
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:04:28
     */
    int deleteByPrimaryKey(String dorm_adm_ano);
    /**
     * @Function: AdminDao.java
     * @Description: 根据dorm_adm_ano更新状态
     *
     * @param:String dorm_adm_ano
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午5:09:24
     */
    int updateStateByPrimaryKey(Admin upInfo);
    /**
     * @Function: AdminDao.java
     * @Description: 更新数据（）
     *
     * @param:Admin adm
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:47
     */
    int updateByPrimaryKeySelective(Admin adm);
    /**
     * @Function: AdminDao.java
     * @Description: 更新数据
     *
     * @param:Admin adm
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:52
     */
    int updateByPrimaryKey(Admin adm);
    /**
     * @Function: AdminDao.java
     * @Description: 根据主键查询单挑数据
     *
     * @param:String dorm_adm_ano
     * @return：Student
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:56
     */
    Admin selectByPrimaryKey(String dorm_adm_ano);
    /**
     * @Function: AdminDao.java
     * @Description: 根据dorm_adm_state获取管理员信息
     *
     * @param:String dorm_adm_state
     * @return：List<Admin>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午5:46:39
     */
    List<Admin> getAllByState(String dorm_adm_state);
    /**
     * @Function: AdminDao.java
     * @Description: 获取所有学生信息
     *
     * @param:null
     * @return：List<Admin>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:06:00
     */
    List<Admin> getAll();
    /**
     * @Function: AdminDao.java
     * @Description: 根据dorm_adm_ano和dorm_adm_password查询数据
     *
     * @param:
     * @return：Admin
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:06:04
     */
    Admin selectByAnoAndPassWord(@Param("dorm_adm_ano")String dorm_adm_ano,@Param("dorm_adm_password")String dorm_adm_password);

}
