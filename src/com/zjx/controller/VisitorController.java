package com.zjx.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zjx.model.Visitor;
import com.zjx.service.VisitorService;

@Controller
@RequestMapping("/visitor")
public class VisitorController {
	private static final Logger log = Logger.getLogger(VisitorController.class);
	@Autowired
    private VisitorService visitorService;
	
	public VisitorService getVisitorService() {
		return visitorService;
	}
	public void setVisitorService(VisitorService visitorService) {
		this.visitorService = visitorService;
	}
	/**
	 * @Function: VisitorController.java
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
	@ResponseBody
    public void add(Visitor vis,HttpServletRequest request,HttpServletResponse resp){
    	System.out.println(vis.getDorm_vis_name() + ":::::" + vis.getDorm_vis_sex()+ ":::::" + vis.getDorm_vis_date() + ":::::" + vis.getDorm_roo_pno()+ ":::::" + vis.getDorm_vis_remarks());
		String str = visitorService.addInfo(vis);
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
	 * @Function: VisitorController.java
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
            List<Visitor> list = visitorService.getAll();
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
	 * @Function: VisitorController.java
	 * @Description: 按姓名获取信息
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午6:00:45
	 */
	@RequestMapping("getAllByName")
    public String getAddByName(String dorm_vis_name,HttpServletRequest request){  
        try {
            List<Visitor> list = visitorService.findByName(dorm_vis_name);
            System.out.println("------Visitor_list-----"+list.size());
            request.setAttribute("addLists", list);
            return "listAllVis";
        } catch (Exception e) {
        	log.error(e);
            request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
            return "exception";
        }
    }
    /**
     * @Function: VisitorController.java
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
    public String del(String dorm_vis_vno,HttpServletRequest req,HttpServletResponse resp){  
        try {
            String str = visitorService.delete(dorm_vis_vno);
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
     * @Function: VisitorController.java
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
    public String modify(String dorm_vis_vno,HttpServletRequest request){
        try {
        	Visitor vis = visitorService.findById(dorm_vis_vno);
            request.setAttribute("add", vis);
            return "modifyVis";
        } catch (Exception e) {
        	log.error(e);
            request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());  
            return "exception";
        }  
    }
    /**
     * @Function: VisitorController.java
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
    public void update(Visitor vis,HttpServletRequest req,HttpServletResponse resp){
    	String str = visitorService.update(vis);
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

}
