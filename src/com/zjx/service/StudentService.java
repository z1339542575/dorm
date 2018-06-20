package com.zjx.service;

import java.util.List;

import com.zjx.model.Student;
/**
 * @ClassName: StudentService.java
 * @Description: Student的service服务
 *
 * @version: v1.0.0
 * @author: ZHjx
 * @date: 2018-4-16 下午3:58:11 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018-4-16     ZHjx           v1.0.0               修改原因
 */
public interface StudentService {
	/**
	 * @Function: StudentService.java
	 * @Description: 添加数据
	 *
	 * @param:Student addInfo
	 * @return：String
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:58:09
	 */
    String addInfo(Student addInfo);
    /**
	 * @Function: StudentService.java
	 * @Description: 注册数据
	 *
	 * @param:Student addInfo
	 * @return：String
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:58:09
	 */
    String addRegister(Student addInfo);
    /**
     * @Function: StudentService.java
     * @Description: 获取所有数据
     *
     * @param:null
     * @return：List<Student>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午5:52:05
     */
    List<Student> getAll();
    /**
     * @Function: StudentService.java
     * @Description: 获取有效数据
     *
     * @param:null
     * @return：List<Student>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:19
     */
    List<Student> getEffeAll();
    /**
     * @Function: StudentService.java
     * @Description: 获取失效数据
     *
     * @param:null
     * @return：List<Student>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:23
     */
    List<Student> getLoseAll();
    /**
     * @Function: StudentService.java
     * @Description: 按学号删除
     *
     * @param:String dorm_stu_sno
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:26
     */
    String delete(String dorm_stu_sno);
    /**
     * @Function: StudentService.java
     * @Description: 数据失效（禁用）
     *
     * @param:Student delInfo
     * @return：Student
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    String updateLoseState(Student delInfo);
    /**
     * @Function: StudentService.java
     * @Description: 数据生效（通过）
     *
     * @param:Student delInfo
     * @return：Student
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    String updateEffeState(Student delInfo);
    /**
     * @Function: StudentService.java
     * @Description: 按学号查询
     *
     * @param:String dorm_stu_sno
     * @return：Student
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:30
     */
    Student findById(String dorm_stu_sno);
    /**
     * @Function: StudentService.java
     * @Description: 更新数据
     *
     * @param:Student addInfo
     * @return：String
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:33
     */
    String update(Student addInfo);
    /**
     * @Function: StudentService.java
     * @Description: 登陆账号
     *
     * @param:Student stu
     * @return：Student
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:58:37
     */
    Student getLoginStu(String dorm_stu_sno,String dorm_stu_password);
}
