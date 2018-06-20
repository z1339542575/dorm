package com.zjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjx.dao.StudentDao;
import com.zjx.model.Student;
import com.zjx.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	public StudentDao getStudentDao() {
		return studentDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	@Override
	public String addInfo(Student addInfo) {
        String getDorm_stu_sno = addInfo.getDorm_stu_sno();
		Student stu = studentDao.selectByPrimaryKey(getDorm_stu_sno);
		if(stu == null){
			if(studentDao.insertSelective(addInfo) == 1){
				return "succeed";
			}else
				return "fail";
		}else{
			return "exist";
		}
	}
	@Override
	public String addRegister(Student addInfo) {
        String getDorm_stu_sno = addInfo.getDorm_stu_sno();
		Student stu = studentDao.selectByPrimaryKey(getDorm_stu_sno);
		if(stu == null){
			addInfo.setDorm_stu_state("未审核");
			if(studentDao.insert(addInfo) == 1){
				return "succeed";
			}else
				return "fail";
		}else{
			return "exist";
		}
	}
	@Override
	public List<Student> getAll() {
		List<Student> list = studentDao.getAll();
		return list;
	}
	@Override
	public List<Student> getEffeAll() {
		String dorm_stu_state = "正常";
		List<Student> list = studentDao.getAllByState(dorm_stu_state);
		return list;
	}
	@Override
	public List<Student> getLoseAll() {
		String dorm_stu_state = "未审核";
		List<Student> list = studentDao.getAllByState(dorm_stu_state);
		return list;
	}
	@Override
	public String delete(String dorm_stu_sno) {
		if (studentDao.deleteByPrimaryKey(dorm_stu_sno) == 1){
			return "succeed";
		  }
		  return "fail"; 
	}
	@Override
	public String updateLoseState(Student delInfo) {
		String dorm_stu_state = "未审核";
		delInfo.setDorm_stu_state(dorm_stu_state);
		if (studentDao.updateStateByPrimaryKey(delInfo) == 1){
			return "succeed";
		  }
		  return "fail";
	}
	@Override
	public String updateEffeState(Student delInfo) {
		String dorm_stu_state = "正常";
		delInfo.setDorm_stu_state(dorm_stu_state);
		if (studentDao.updateStateByPrimaryKey(delInfo) == 1){
			return "succeed";
		  }
		  return "fail";
	}
	@Override
	public Student findById(String dorm_stu_sno) {
		 return studentDao.selectByPrimaryKey(dorm_stu_sno);
	}
	@Override
	public String update(Student updateInfo) {
	    if (studentDao.updateByPrimaryKeySelective(updateInfo) == 1){
			return "succeed";
		  }
		  return "fail"; 
	}
	@Override
	public Student getLoginStu(String dorm_stu_sno,String dorm_stu_password) {
		Student stu = studentDao.selectBySnoAndPassWord(dorm_stu_sno,dorm_stu_password);
		return stu; 
	}

}
