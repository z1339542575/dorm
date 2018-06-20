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
import com.zjx.model.Health;
import com.zjx.service.HealthService;

@Controller
@RequestMapping("/health")
public class HealthController {
	private static final Logger log = Logger.getLogger(HealthController.class);
	@Autowired
    private HealthService healthService;
	public HealthService getHealthService() {
		return healthService;
	}
	public void setHealthService(HealthService healthService) {
		this.healthService = healthService;
	}
	/**
	 * @Function: HealthController.java
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
    public void add(Health hea,HttpServletRequest request,HttpServletResponse resp){
    	System.out.println(hea.getDorm_roo_rno() + ":::::" + hea.getDorm_roo_pno() + ":::::" + hea.getDorm_hea_date() + ":::::" + hea.getDorm_hea_score() + ":::::" + hea.getDorm_hea_remarks() );
		String str = healthService.addInfo(hea);
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
	 * @Function: HealthController.java
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
            List<Health> list = healthService.getAll();
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
     * @Function: HealthController.java
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
    public String del(String dorm_hea_hno,HttpServletRequest req,HttpServletResponse resp){  
        try {
            String str = healthService.delete(dorm_hea_hno);
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
     * @Function: HealthController.java
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
    public String modify(String dorm_hea_hno,HttpServletRequest request){
        try {
        	Health hea = healthService.findById(dorm_hea_hno);
            request.setAttribute("add", hea);
            return "modifyHea";
        } catch (Exception e) {
        	log.error(e);
            request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());  
            return "exception";
        }  
    }
    /**
     * @Function: HealthController.java
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
    public void update(Health hea,HttpServletRequest req,HttpServletResponse resp){
    	String str = healthService.update(hea);
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
