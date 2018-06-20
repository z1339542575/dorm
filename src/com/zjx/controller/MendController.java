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
import com.zjx.model.Mend;
import com.zjx.service.MendService;

@Controller
@RequestMapping("/mend")
public class MendController {
	private static final Logger log = Logger.getLogger(MendController.class);
	@Autowired
    private MendService mendService;
	public MendService getMendService() {
		return mendService;
	}
	public void setMendService(MendService mendService) {
		this.mendService = mendService;
	}
	/**
	 * @Function: MendController.java
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
    public void add(Mend men,HttpServletRequest request,HttpServletResponse resp){
    	System.out.println(men.getDorm_roo_rno() + ":::::" + men.getDorm_roo_pno()+ ":::::" + men.getDorm_men_date() + ":::::" + men.getDorm_men_info()+ ":::::" + men.getDorm_men_state());
		String str = mendService.addInfo(men);
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
	 * @Function: MendController.java
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
            List<Mend> list = mendService.getAll();
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
     * @Function: MendController.java
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
    public String del(String dorm_men_mno,HttpServletRequest req,HttpServletResponse resp){  
        try {
            String str = mendService.delete(dorm_men_mno);
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
     * @Function: MendController.java
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
    public String modify(String dorm_men_mno,HttpServletRequest request){
        try {
        	Mend men = mendService.findById(dorm_men_mno);
            request.setAttribute("add", men);
            return "modifyMend";
        } catch (Exception e) {
        	log.error(e);
            request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());  
            return "exception";
        }
    }
    /**
     * @Function: MendController.java
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
    public void update(Mend men,HttpServletRequest req,HttpServletResponse resp){
    	String str = mendService.update(men);
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
     * @Function: MendController.java
     * @Description: 更新领取状态
     *
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午6:01:40
     */
    @RequestMapping("updateState")
    @ResponseBody
    public String updateState(Mend updateInfo,HttpServletRequest req,HttpServletResponse resp){
    	try {
    	String str = mendService.updateState(updateInfo);
		String json = JSON.toJSONString(str);
		System.out.println(json);
        return json;
    	}catch (Exception e) {
        	log.error(e);
            req.setAttribute("InfoMessage", "更新信息失败！具体异常信息：" + e.getMessage());
            return "exception";
        }
    }
}
