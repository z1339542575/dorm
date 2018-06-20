package com.zjx.dao;

import java.util.List;

import com.zjx.model.Lose;

public interface LoseDao {
	/**
	 * @Function: LoseDao.java
	 * @Description: 添加学生
	 *
	 * @param: Lose los
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:05:36
	 */
	int insert(Lose los);
	/**
	 * @Function: LoseDao.java
	 * @Description: 添加学生信息
	 *
	 * @param: Lose los
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:04:39
	 */
    int insertSelective(Lose los);
    /**
     * @Function: LoseDao.java
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
    int deleteByPrimaryKey(String dorm_lose_lno);
    /**
     * @Function: LoseDao.java
     * @Description: 更新状态（）
     *
     * @param:Lose los
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:47
     */
    int updateStateByPrimaryKey(Lose los);
    /**
     * @Function: LoseDao.java
     * @Description: 更新数据（）
     *
     * @param:Lose los
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:47
     */
    int updateByPrimaryKeySelective(Lose los);
    /**
     * @Function: LoseDao.java
     * @Description: 更新数据
     *
     * @param:Lose los
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:52
     */
    int updateByPrimaryKey(Lose los);
    /**
     * @Function: LoseDao.java
     * @Description: 根据主键查询单挑数据
     *
     * @param:String dorm_hea_hno
     * @return：Lose
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:56
     */
    Lose selectByPrimaryKey(String dorm_lose_lno);
    /**
     * @Function: LoseDao.java
     * @Description: 获取所有学生信息
     *
     * @param:null
     * @return：List<Lose>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:06:00
     */
    List<Lose> getAll();

}