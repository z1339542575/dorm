package com.zjx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zjx.model.Admin;
import com.zjx.model.Student;

@Controller
@RequestMapping("/login")
public class LoginController{

	@RequestMapping("/tabOrPop/{view}")
	public String tabOrPop(@PathVariable("view") String view) {
		System.err.println("页面跳转");
		return view;
	}
	@RequestMapping("deletStu")
	public String deletStu(String dorm_stu_sno, HttpServletRequest req, HttpServletResponse resp) {
		if (dorm_stu_sno!=null) {
			req.getSession().removeAttribute("loginInfoStu");
			req.getSession().removeAttribute("rightsStu");
			return "redirect:/login/tabOrPop/loginStu.do";
		}
		return "";
	}
	@RequestMapping("deletAdm")
	public String deletAdm(String dorm_adm_ano, HttpServletRequest req, HttpServletResponse resp) {
		if (dorm_adm_ano!=null) {
			req.getSession().removeAttribute("loginInfoAdm");
			req.getSession().removeAttribute("rightsAdm");
			return "redirect:/login/tabOrPop/loginAdm.do";
		}
		return "";
	}
	
	@RequestMapping("selectRightsStu")
	public void selectRightsStu(HttpServletRequest req,HttpServletResponse resp){
		Student loginInfoStu = (Student) req.getSession().getAttribute("loginInfoStu");
		HttpSession ss = req.getSession();
    	ss.setAttribute("rightsStu", loginInfoStu);
	}
	@RequestMapping("selectRightsAdm")
	public void selectRightsAdm(HttpServletRequest req,HttpServletResponse resp){
		Admin loginInfoAdm = (Admin) req.getSession().getAttribute("loginInfoAdm");
		HttpSession ss = req.getSession();
    	ss.setAttribute("rightsAdm", loginInfoAdm);
	}
	
}