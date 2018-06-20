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
import com.zjx.model.Lose;
import com.zjx.service.LoseService;

@Controller
@RequestMapping("/lose")
public class LoseController {
	private static final Logger log = Logger.getLogger(LoseController.class);
	@Autowired
    private LoseService loseService;
	public LoseService getLoseService() {
		return loseService;
	}
	public void setLoseService(LoseService loseService) {
		this.loseService = loseService;
	}
	/**
	 * @Function: LoseController.java
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
    public void add(Lose los,HttpServletRequest request,HttpServletResponse resp){
    	System.out.println(los.getDorm_lose_name() + ":::::" + los.getDorm_lose_info() + ":::::" + los.getDorm_lose_date() + ":::::" + los.getDorm_lose_addr() + ":::::" + los.getDorm_lose_state() );
		String str = loseService.addInfo(los);
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
	 * @Function: LoseController.java
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
            List<Lose> list = loseService.getAll();
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
     * @Function: LoseController.java
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
    public String del(String dorm_lose_lno,HttpServletRequest req,HttpServletResponse resp){  
        try {
            String str = loseService.delete(dorm_lose_lno);
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
     * @Function: LoseController.java
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
    public String modify(String dorm_lose_lno,HttpServletRequest request){
        try {
        	Lose los = loseService.findById(dorm_lose_lno);
            request.setAttribute("add", los);
            return "modifyLose";
        } catch (Exception e) {
        	log.error(e);
            request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());  
            return "result";
        }  
    }
    /**
     * @Function: LoseController.java
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
    public void update(Lose los,HttpServletRequest req,HttpServletResponse resp){
    	String str = loseService.update(los);
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
     * @Function: LoseController.java
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
    public String updateState(Lose updateInfo,HttpServletRequest req,HttpServletResponse resp){
    	try {
    	String str = loseService.updateState(updateInfo);
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
