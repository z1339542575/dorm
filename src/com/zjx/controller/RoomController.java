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
import com.zjx.model.Room;

import com.zjx.service.RoomService;

@Controller
@RequestMapping("/room")
public class RoomController {
	private static final Logger log = Logger.getLogger(RoomController.class);
	@Autowired
    private RoomService roomService;
	
	public RoomService getRoomService() {
		return roomService;
	}
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	/**
	 * @Function: RoomController.java
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
    public void add(Room room,HttpServletRequest request,HttpServletResponse resp){
    	System.out.println(room.getDorm_roo_xno() + ":::::" + room.getDorm_roo_rno()+ ":::::" + room.getDorm_roo_pno() + ":::::" + room.getDorm_roo_bnum()); 
		String str = roomService.addInfo(room);
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
	 * @Function: RoomController.java
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
            List<Room> list = roomService.getAll();
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
	 * @Function: RoomController.java
	 * @Description: 按房号获取信息
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午6:00:45
	 */
	@RequestMapping("getAllByRno")
    public String getAddByRno(String dorm_roo_rno,HttpServletRequest request){  
        try {
            List<Room> list = roomService.findByRno(dorm_roo_rno);
            System.out.println("------Room_list-----"+list.size());
            request.setAttribute("addLists", list);
            return "listAllRoom";
        } catch (Exception e) {
        	log.error(e);
            request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
            return "result";
        }
    }
	/**
	 * @Function: RoomController.java
	 * @Description: 按楼号获取信息
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午6:00:45
	 */
	@RequestMapping("getAllByPno")
    public String getAddByPno(String dorm_roo_pno,HttpServletRequest request){  
        try {
            List<Room> list = roomService.findByPno(dorm_roo_pno) ;
            System.out.println("------Room_list-----"+list.size());
            request.setAttribute("addLists", list);
            return "listAllRoom";
        } catch (Exception e) {
        	log.error(e);
            request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());
            return "result";
        }
    }
    /**
     * @Function: RoomController.java
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
    public String del(String dorm_roo_xno,HttpServletRequest req,HttpServletResponse resp){  
        try {
            String str = roomService.delete(dorm_roo_xno);
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
     * @Function: RoomController.java
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
    public String modify(String dorm_roo_xno,HttpServletRequest request){
        try {
        	Room room = roomService.findById(dorm_roo_xno);
            request.setAttribute("add", room);
            return "modifyRoom";
        } catch (Exception e) {
        	log.error(e);
            request.setAttribute("InfoMessage", "信息载入失败！具体异常信息：" + e.getMessage());  
            return "result";
        }  
    }
    /**
     * @Function: RoomController.java
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
    public void update(Room room,HttpServletRequest req,HttpServletResponse resp){
    	String str = roomService.update(room);
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

