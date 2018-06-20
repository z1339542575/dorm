package com.zjx.service;

import java.util.List;

import com.zjx.model.Health;

public interface HealthService {
	/**
	 * @Function: HealthService.java
	 * @Description: 添加数据
	 *
	 * @param:Health addInfo
	 * @return：String
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:58:09
	 */
    String addInfo(Health addInfo);
    /**
     * @Function: HealthService.java
     * @Description: 获取所有数据
     *
     * @param:null
     * @return：List<Health>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午5:52:05
     */
    List<Health> getAll();
    /**
     * @Function: HealthService.java
     * @Description: 按序号删除
     *
     * @param:String dorm_vis_name
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:26
     */
    String delete(String dorm_hea_hno);
    /**
     * @Function: HealthService.java
     * @Description: 按序号查询单条数据
     *
     * @param:String dorm_vis_vno
     * @return：Health
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    Health findById(String dorm_hea_hno);
    /**
     * @Function: HealthService.java
     * @Description: 按dorm_roo_rno查询
     *
     * @param:String dorm_roo_rno
     * @return：Health
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    List<Health> findByRno(String dorm_roo_rno);

    /**
     * @Function: HealthService.java
     * @Description: 更新数据
     *
     * @param:Health updateInfo
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:33
     */
    String update(Health updateInfo);
}