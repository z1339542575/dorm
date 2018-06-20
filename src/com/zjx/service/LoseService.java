package com.zjx.service;

import java.util.List;

import com.zjx.model.Lose;

public interface LoseService {
	/**
	 * @Function: LoseService.java
	 * @Description: 添加数据
	 *
	 * @param:Lose addInfo
	 * @return：String
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:58:09
	 */
    String addInfo(Lose addInfo);
    /**
     * @Function: LoseService.java
     * @Description: 获取所有数据
     *
     * @param:null
     * @return：List<Lose>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午5:52:05
     */
    List<Lose> getAll();
    /**
     * @Function: LoseService.java
     * @Description: 按序号删除
     *
     * @param:String dorm_lose_lno
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:26
     */
    String delete(String dorm_lose_lno);
    /**
     * @Function: LoseService.java
     * @Description: 按序号查询单条数据
     *
     * @param:String dorm_lose_lno
     * @return：Lose
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    Lose findById(String dorm_lose_lno);
    /**
     * @Function: LoseService.java
     * @Description: 更新数据
     *
     * @param:Lose updateInfo
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:33
     */
    String update(Lose updateInfo);
    /**
     * @Function: LoseService.java
     * @Description: 更新领取状态数据
     *
     * @param:Lose updateInfo
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:33
     */
    String updateState(Lose updateInfo);

}