package com.zjx.dao;

import java.util.List;

import com.zjx.model.Mend;
public interface MendDao {
	/**
	 * @Function: MendDao.java
	 * @Description: 添加学生
	 *
	 * @param: Mend men
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:05:36
	 */
	int insert(Mend men);
	/**
	 * @Function: MendDao.java
	 * @Description: 添加学生信息
	 *
	 * @param: Mend men
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:04:39
	 */
    int insertSelective(Mend men);
    /**
     * @Function: MendDao.java
     * @Description: 根据主键删除信息(物理删除)
     *
     * @param:String dorm_men_mno
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:04:28
     */
    int deleteByPrimaryKey(String dorm_men_mno);
    /**
     * @Function: LoseDao.java
     * @Description: 更新状态（）
     *
     * @param:Mend men
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:47
     */
    int updateStateByPrimaryKey(Mend men);
    /**
     * @Function: MendDao.java
     * @Description: 更新数据（）
     *
     * @param:Mend men
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:47
     */
    int updateByPrimaryKeySelective(Mend men);
    /**
     * @Function: HealthDao.java
     * @Description: 更新数据
     *
     * @param:Mend men
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:52
     */
    int updateByPrimaryKey(Mend men);
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
    Mend selectByPrimaryKey(String dorm_hea_hno);
    /**
     * @Function: HealthDao.java
     * @Description: 根据dorm_roo_rno查询数据
     *
     * @param:String dorm_lose_state
     * @return：List<Health>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:56
     */
    List<Mend> selectByState(String dorm_lose_state);
    /**
     * @Function: MendDao.java
     * @Description: 获取所有学生信息
     *
     * @param:null
     * @return：List<Visitor>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:06:00
     */
    List<Mend> getAll();

}