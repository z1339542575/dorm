package com.zjx.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zjx.model.Student;
/**
 * @ClassName: StudentDao.java
 * @Description: Student的DAO接口
 *
 * @version: v1.0.0
 * @author: ZHjx
 * @date: 2018-4-16 下午3:05:27 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2018-4-16     ZHjx           v1.0.0               修改原因
 */
public interface StudentDao {
	/**
	 * @Function: StudentDao.java
	 * @Description: 添加学生
	 *
	 * @param:Student stu
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:05:36
	 */
	int insert(Student stu);
	/**
	 * @Function: StudentDao.java
	 * @Description: 添加学生信息
	 *
	 * @param:Student stu
	 * @return：int
	 * @throws：异常描述
	 *---------------------------------------------------------*
	 * @version: v1.0.0
	 * @author: ZHjx
	 * @date: 2018-4-16 下午3:04:39
	 */
    int insertSelective(Student stu);
    /**
     * @Function: StudentDao.java
     * @Description: 根据dorm_stu_sno删除信息(物理删除)
     *
     * @param:String dorm_stu_sno
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:04:28
     */
    int deleteByPrimaryKey(String dorm_stu_sno);
    /**
     * @Function: StudentDao.java
     * @Description: 根据dorm_stu_sno更新状态
     *
     * @param:String dorm_stu_sno
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午5:09:24
     */
    int updateStateByPrimaryKey(Student stu);
    /**
     * @Function: StudentDao.java
     * @Description: 更新数据（）
     *
     * @param:Student stu
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:47
     */
    int updateByPrimaryKeySelective(Student stu);
    /**
     * @Function: StudentDao.java
     * @Description: 更新数据
     *
     * @param:Student stu
     * @return：int
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:52
     */
    int updateByPrimaryKey(Student stu);
    /**
     * @Function: StudentDao.java
     * @Description: 根据dorm_stu_sno查询单挑数据
     *
     * @param:String dorm_stu_sno
     * @return：Student
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:05:56
     */
    Student selectByPrimaryKey(String dorm_stu_sno);
    /**
     * @Function: StudentDao.java
     * @Description: 根据dorm_stu_state获取学生信息
     *
     * @param:String dorm_stu_state
     * @return：List<Student>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午5:46:39
     */
    List<Student> getAllByState(String dorm_stu_state);
    /**
     * @Function: StudentDao.java
     * @Description: 获取所有学生信息
     *
     * @param:null
     * @return：List<Student>
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:06:00
     */
    List<Student> getAll();
    /**
     * @Function: StudentDao.java
     * @Description: 根据dorm_stu_sno和dorm_stu_name查询数据
     *
     * @param:
     * @return：Student
     * @throws：异常描述
     *---------------------------------------------------------*
     * @version: v1.0.0
     * @author: ZHjx
     * @date: 2018-4-16 下午3:06:04
     */
    Student selectBySnoAndPassWord(@Param("dorm_stu_sno")String dorm_stu_sno,@Param("dorm_stu_password")String dorm_stu_password);
}
