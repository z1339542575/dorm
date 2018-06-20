package com.zjx.service;

import java.util.List;

import com.zjx.model.Admin;
/**
 * @ClassName: AdminService.java
 * @Description: Admin的Service服务
 *
 * @version: v1.0.0
 * @author: ZHjx
 * @date: 2018-4-25 上午9:49:34 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018-4-25     ZHjx           v1.0.0               修改原因
 */
public interface AdminService {
	/**
	 * @Function: AdminService.java
	 * @Description: 添加数据
	 *
	 * @param:Admin addInfo
	 * @return：String
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:58:09
	 */
    String addInfo(Admin addInfo);
    /**
     * @Function: AdminService.java
     * @Description: 获取所有数据
     *
     * @param:null
     * @return：List<Admin>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午5:52:05
     */
    List<Admin> getAll();
    /**
     * @Function: AdminService.java
     * @Description: 获取有效数据
     *
     * @param:null
     * @return：List<Admin>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:19
     */
    List<Admin> getEffeAll();
    /**
     * @Function: AdminService.java
     * @Description: 获取失效数据
     *
     * @param:null
     * @return：List<Admin>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:23
     */
    List<Admin> getLoseAll();
    /**
     * @Function: AdminService.java
     * @Description: 按学号删除
     *
     * @param:String dorm_adm_ano
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:26
     */
    String delete(String dorm_adm_ano);
    /**
     * @Function: AdminService.java
     * @Description: 更新为超级管理员
     *
     * @param:Admin upInfo
     * @return：Admin
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    String updateSuperState(Admin upInfo);
    /**
     * @Function: AdminService.java
     * @Description: 更新为普通管理员
     *
     * Admin upInfo
     * @return：Admin
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    String updateCommonState(Admin upInfo);
    /**
     * @Function: AdminService.java
     * @Description: 按学号查询
     *
     * @param:String dorm_adm_ano
     * @return：Admin
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    Admin findById(String dorm_adm_ano);
    /**
     * @Function: StudentService.java
     * @Description: 更新数据
     *
     * @param:Admin updateInfo
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:33
     */
    String update(Admin updateInfo);
    /**
     * @Function: AdminService.java
     * @Description: 登陆账号
     *
     * @param:Admin adm
     * @return：Admin
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:37
     */
    Admin getLoginAdm(String dorm_adm_ano,String dorm_adm_password);
}
