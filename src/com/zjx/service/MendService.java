package com.zjx.service;

import java.util.List;

import com.zjx.model.Mend;

public interface MendService {
	/**
	 * @Function: MendService.java
	 * @Description: 添加数据
	 *
	 * @param:Mend addInfo
	 * @return：String
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:58:09
	 */
    String addInfo(Mend addInfo);
    /**
     * @Function: MendService.java
     * @Description: 获取所有数据
     *
     * @param:null
     * @return：List<Mend>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午5:52:05
     */
    List<Mend> getAll();
    /**
     * @Function: MendService.java
     * @Description: 按序号删除
     *
     * @param:String dorm_men_mno
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:26
     */
    String delete(String dorm_men_mno);
    /**
     * @Function: MendService.java
     * @Description: 按序号查询单条数据
     *
     * @param:String dorm_men_mno
     * @return：Mend
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    Mend findById(String dorm_men_mno);
    /**
     * @Function: MendService.java
     * @Description: 按状态查询
     *
     * @param:String dorm_men_state
     * @return：Mend
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    List<Mend> findByState(String dorm_men_state);
    /**
     * @Function: MendService.java
     * @Description: 更新数据
     *
     * @param:Mend updateInfo
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:33
     */
    String update(Mend updateInfo);
    /**
     * @Function: MendService.java
     * @Description: 更新领取状态数据
     *
     * @param:Mend updateInfo
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:33
     */
    String updateState(Mend updateInfo);
}