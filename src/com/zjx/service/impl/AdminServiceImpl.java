package com.zjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjx.dao.AdminDao;
import com.zjx.model.Admin;
import com.zjx.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao  adminDao;
	public AdminDao getAdminDao() {
		return adminDao;
	}
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public String addInfo(Admin addInfo) {
		String dorm_adm_ano = addInfo.getDorm_adm_ano();
		Admin adm = adminDao.selectByPrimaryKey(dorm_adm_ano);
		if(adm == null){
			if(adminDao.insertSelective(addInfo) == 1){
				return "succeed";
			}else
				return "fail"; 
		}else{
			return "exist";
		}
	}

	@Override
	public List<Admin> getAll() {
		List<Admin> list = adminDao.getAll();
		return list;
	}

	@Override
	public List<Admin> getEffeAll() {
		String dorm_adm_state = "1";
		List<Admin> list = adminDao.getAllByState(dorm_adm_state);
		return list;
	}

	@Override
	public List<Admin> getLoseAll() {
		String dorm_adm_state = "0";
		return adminDao.getAllByState(dorm_adm_state); 
	}

	@Override
	public String delete(String dorm_adm_ano) {
		if (adminDao.deleteByPrimaryKey(dorm_adm_ano) == 1) {  
            return "succeed";
        }  
        return "fail";
	}

	@Override
	public String updateSuperState(Admin upInfo) {
		String dorm_adm_state = "超级管理员";
		upInfo.setDorm_adm_state(dorm_adm_state);
		if (adminDao.updateStateByPrimaryKey(upInfo) == 1) {
			 return "succeed";
			}
		return "fail";
	}
	
	@Override
	public String updateCommonState(Admin upInfo) {
		String dorm_adm_state = "普通管理员";
		upInfo.setDorm_adm_state(dorm_adm_state);
		if (adminDao.updateStateByPrimaryKey(upInfo) == 1) {
			 return "succeed";
			}
		return "fail";
	}
	@Override
	public Admin findById(String dorm_adm_ano) {
		return adminDao.selectByPrimaryKey(dorm_adm_ano);
	}

	@Override
	public String update(Admin updateInfo) {
		if (adminDao.updateByPrimaryKeySelective(updateInfo) == 1) {
			return "succeed";
        }
		return "fail";
	}

	@Override
	public Admin getLoginAdm(String dorm_adm_ano, String dorm_adm_password) {
		Admin adm = adminDao.selectByAnoAndPassWord(dorm_adm_ano,dorm_adm_password); 
		return adm;
	}

}
