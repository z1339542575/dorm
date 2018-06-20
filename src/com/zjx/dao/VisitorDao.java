package com.zjx.dao;

import java.util.List;

import com.zjx.model.Visitor;
/**
 * @ClassName: VisitorDao.java
 * @Description: Visitor的DAO
 *
 * @version: v1.0.0
 * @author: ZHjx
 * @date: 2018-4-25 上午9:45:44 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018-4-25     ZHjx           v1.0.0               修改原因
 */
public interface VisitorDao {
	/**
	 * @Function: VisitorDao.java
	 * @Description: 添加学生
	 *
	 * @param: Visitor vis
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:05:36
	 */
	int insert(Visitor vis);
	/**
	 * @Function: VisitorDao.java
	 * @Description: 添加学生信息
	 *
	 * @param: Visitor vis
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:04:39
	 */
    int insertSelective(Visitor vis);
    /**
     * @Function: VisitorDao.java
     * @Description: 根据主键删除信息(物理删除)
     *
     * @param:String dorm_vis_vno
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:04:28
     */
    int deleteByPrimaryKey(String dorm_vis_vno);
    /**
     * @Function: VisitorDao.java
     * @Description: 更新数据（）
     *
     * @param:Visitor vis
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:47
     */
    int updateByPrimaryKeySelective(Visitor vis);
    /**
     * @Function: VisitorDao.java
     * @Description: 更新数据
     *
     * @param:Visitor vis
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:52
     */
    int updateByPrimaryKey(Visitor vis);
    /**
     * @Function: VisitorDao.java
     * @Description: 根据主键查询单挑数据
     *
     * @param:String dorm_vis_vno
     * @return：Visitor
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:56
     */
    Visitor selectByPrimaryKey(String dorm_vis_vno);
    /**
     * @Function: VisitorDao.java
     * @Description: 根据dorm_vis_name查询数据
     *
     * @param:String dorm_vis_name
     * @return：List<Visitor>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:56
     */
    List<Visitor> selectByName(String dorm_vis_name);
    /**
     * @Function: VisitorDao.java
     * @Description: 获取所有访客信息
     *
     * @param:null
     * @return：List<Visitor>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:06:00
     */
    List<Visitor> getAll();

}