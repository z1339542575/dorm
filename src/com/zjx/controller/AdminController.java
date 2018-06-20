package com.zjx.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zjx.model.Admin;
import com.zjx.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	private static final Logger log = Logger.getLogger(AdminController.class);
	@Autowired
    private AdminService adminService;
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	/**
	 * @Function: AdminController.java
	 * @Description: 添加信息
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午6:00:49
	 */

    @RequestMapping("addInfo")
    public void add(Admin adm,HttpServletRequest req,HttpServletResponse resp){
            System.out.println(adm.getDorm_adm_ano() + ":::::" + adm.getDorm_adm_name() + ":::::" + adm.getDorm_adm_sex() + ":::::" + adm.getDorm_adm_password());  
            String str = adminService.addInfo(adm);
            System.out.println(str);
            resp.setCharacterEncoding("UTF-8");
    		PrintWriter out = null;
    		try {
    			out = resp.getWriter();
    			out.print(str);
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    }
	/**
	 * @Function: AdminController.java
	 * @Description: 获取全部信息
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午6:00:45
	 */
	@RequestMapping("getAll")
	@ResponseBody
    public String getAddInfoAll(HttpServletRequest req,HttpServletResponse resp){  
		 try {
	            List<Admin> list = adminService.getAll();
	            System.out.println("------Student_list-----"+list.size());
	            req.setAttribute("addLists", list);
	            String json = JSON.toJSONString(list);
	            return json;
	        } catch (Exception e) {
	        	log.error(e);
	        	req.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
	            return "result";
	        }
    }
	/**
	 * @Function: AdminController.java
	 * @Description: 获取有效信息
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午6:00:42
	 */
    @RequestMapping("getEffeAll")
    @ResponseBody
    public String getEffeAll(HttpServletRequest req,HttpServletResponse resp){  
    	try {
            List<Admin> list = adminService.getEffeAll();
            System.out.println("------Student_list-----"+list.size());
            req.setAttribute("addLists", list);
            String json = JSON.toJSONString(list);
            return json;
        } catch (Exception e) {
        	log.error(e);
        	req.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
            return "result";
        }
    }
    /**
     * @Function: AdminController.java
     * @Description: 物理删除
     *
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午6:00:36
     */
    @RequestMapping("del")
    @ResponseBody
    public String del(String dorm_adm_ano,HttpServletRequest req,HttpServletResponse resp){
    	try {
            String str = adminService.delete(dorm_adm_ano);
            req.setAttribute("InfoMessage", str);
            String json = JSON.toJSONString(str);
            System.out.println("------return-----"+json);
            return json;
        } catch (Exception e) {
        	log.error(e);
            req.setAttribute("InfoMessage", "删除信息失败！具体异常信息：" + e.getMessage());
            return "exception";
        }
    }
    /**
     * @Function: AdminController.java
     * @Description: 提取更新信息
     *
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午6:01:53
     */
    @RequestMapping("modify")
    public String modify(String dorm_adm_ano,HttpServletRequest request){
        try {
        	Admin adm = adminService.findById(dorm_adm_ano);
            request.setAttribute("add", adm);
            return "modifyAdm";
        } catch (Exception e) {
        	log.error(e);
            request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());  
            return "result";
        }  
    }
    /**
     * @Function: AdminController.java
     * @Description: 更新信息
     *
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午6:02:17
     */
    @RequestMapping("update")
    public void update(Admin adm,HttpServletRequest req,HttpServletResponse resp){
        String str = adminService.update(adm);
        System.out.println(str);
        resp.setCharacterEncoding("UTF-8");
		PrintWriter out = null;
		try {
			out = resp.getWriter();
			out.print(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    /**
     * @Function: AdminController.java
     * @Description: 登陆
     *
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午6:02:25
     */
    @RequestMapping("login")
	public void getLoginAdm(String dorm_adm_ano,String dorm_adm_password,HttpServletRequest req,HttpServletResponse resp) {
    	Admin loginInfoAdm=adminService.getLoginAdm(dorm_adm_ano,dorm_adm_password);
    	HttpSession ss = req.getSession();
    	ss.setAttribute("loginInfoAdm",loginInfoAdm);
		String string = "";
    	if(loginInfoAdm == null){
    		string = "fail";
    	}else{
    		string = loginInfoAdm.getDorm_adm_state();
    	}
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = null;
		try {
			out = resp.getWriter();
			out.print(string);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
