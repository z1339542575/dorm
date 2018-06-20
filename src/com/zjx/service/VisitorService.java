package com.zjx.service;

import java.util.List;

import com.zjx.model.Visitor;

public interface VisitorService {
	/**
	 * @Function: VisitorService.java
	 * @Description: 添加数据
	 *
	 * @param:Visitor addInfo
	 * @return：String
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:58:09
	 */
    String addInfo(Visitor addInfo);
    /**
     * @Function: VisitorService.java
     * @Description: 获取所有数据
     *
     * @param:null
     * @return：List<Visitor>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午5:52:05
     */
    List<Visitor> getAll();
    /**
     * @Function: VisitorService.java
     * @Description: 按姓名删除
     *
     * @param:String dorm_vis_vno
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:26
     */
    String delete(String dorm_vis_vno);
    /**
     * @Function: VisitorService.java
     * @Description: 按序号查询单条数据
     *
     * @param:String dorm_vis_vno
     * @return：Visitor
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    Visitor findById(String dorm_vis_vno);
    /**
     * @Function: VisitorService.java
     * @Description: 按姓名查询
     *
     * @param:String dorm_vis_vno
     * @return：Visitor
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    List<Visitor> findByName(String dorm_vis_vno);
    /**
     * @Function: VisitorService.java
     * @Description: 更新数据
     *
     * @param:Visitor updateInfo
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:33
     */
    String update(Visitor updateInfo);
}