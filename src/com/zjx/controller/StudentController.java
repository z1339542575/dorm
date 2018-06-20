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
import com.zjx.model.Student;
import com.zjx.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController{
	private static final Logger log = Logger.getLogger(StudentController.class);
	@Autowired
    private StudentService studentService;
    public StudentService getStudentService() {
		return studentService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	/**
	 * @Function: StudentController.java
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
    public void add(Student stu,HttpServletRequest request,HttpServletResponse resp){
    	System.out.println(stu.getDorm_stu_sno() + ":::::" + stu.getDorm_stu_cno() + ":::::" + stu.getDorm_stu_name() + ":::::" + stu.getDorm_stu_sex() + ":::::" + stu.getDorm_roo_rno() + ":::::" + stu.getDorm_stu_specialty());  
		String str = studentService.addInfo(stu);
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
	 * @Function: StudentController.java
	 * @Description: 注册信息
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午6:00:49
	 */
    @RequestMapping("addRegister")
    public void addRegister(Student stu,HttpServletRequest request,HttpServletResponse resp){
    	System.out.println(stu.getDorm_stu_sno() + ":::::" + stu.getDorm_stu_cno() + ":::::" + stu.getDorm_stu_name() + ":::::" + stu.getDorm_stu_sex() + ":::::" + stu.getDorm_roo_rno() + ":::::" + stu.getDorm_stu_specialty());  
		String str = studentService.addRegister(stu);
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
	 * @Function: StudentController.java
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
            List<Student> list = studentService.getAll();
            req.setAttribute("addLists", list);
            String json = JSON.toJSONString(list);
            System.out.println("------json-----"+json);
            return json;
        } catch (Exception e) {
        	log.error(e);
        	req.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
            return "exception";
        }
    }
	/**
	 * @Function: StudentController.java
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
    @RequestMapping("getLoseAll")
    @ResponseBody
    public String getLoseAll(HttpServletRequest req,HttpServletResponse resp){
    	try {
            List<Student> list = studentService.getLoseAll();
            req.setAttribute("addLists", list);
            String json = JSON.toJSONString(list);
            System.out.println("------json-----"+json);
            return json;
        } catch (Exception e) {
        	log.error(e);
        	req.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
            return "exception";
        }
    }
    /**
     * @Function: StudentController.java
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
    public String del(String dorm_stu_sno,HttpServletRequest req,HttpServletResponse resp){  
        try {
            String str = studentService.delete(dorm_stu_sno);
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
     * @Function: StudentController.java
     * @Description: 逻辑删除(禁用)
     *
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午6:01:40
     */
    @RequestMapping("updateLoseState")
    @ResponseBody
    public String updateLoseState(Student stu,HttpServletRequest req,HttpServletResponse resp){
    	try {
    	String str = studentService.updateLoseState(stu);
		String json = JSON.toJSONString(str);
		System.out.println(json);
        return json;
    	}catch (Exception e) {
        	log.error(e);
            req.setAttribute("InfoMessage", "删除信息失败！具体异常信息：" + e.getMessage());
            return "exception";
        }
		
    }
    /**
     * @Function: StudentController.java
     * @Description: 改变状态(正常)
     *
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午6:01:40
     */
    @RequestMapping("updateEffeState")
    @ResponseBody
    public String updateEffeState(Student stu,HttpServletRequest req,HttpServletResponse resp){
    	try {
    		String str = studentService.updateEffeState(stu);
    		String json = JSON.toJSONString(str);
    		System.out.println(json);
    		return json;
		} catch (Exception e) {
			log.error(e);
            req.setAttribute("InfoMessage", "删除信息失败！具体异常信息：" + e.getMessage());
            return "exception";
		}
    }
    /**
     * @Function: StudentController.java
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
    public String modify(String dorm_stu_sno,HttpServletRequest req,HttpServletResponse resp){
        try {
        	Student stu = studentService.findById(dorm_stu_sno);
        	req.setAttribute("add", stu);
            return "modifyStu";
        } catch (Exception e) {
        	log.error(e);
        	req.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());  
            return "exception";
        }  
    }
    /**
     * @Function: StudentController.java
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
    public void update(Student stu,HttpServletRequest req,HttpServletResponse resp){
    	String str = studentService.update(stu);
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
     * @Function: StudentController.java
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
	public void getLoginStu(String dorm_stu_sno,String dorm_stu_password,HttpServletRequest req,HttpServletResponse resp) {
    	Student loginInfoStu=studentService.getLoginStu(dorm_stu_sno,dorm_stu_password);
    	HttpSession ss = req.getSession();
    	ss.setAttribute("loginInfoStu",loginInfoStu);
    	String string = "";
    	if(loginInfoStu == null){
    		string = "fail";
    	}else{
    		string = loginInfoStu.getDorm_stu_state();
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
