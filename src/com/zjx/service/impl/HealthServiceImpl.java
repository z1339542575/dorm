package com.zjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjx.dao.HealthDao;
import com.zjx.model.Health;
import com.zjx.service.HealthService;
@Service("healthService")
public class HealthServiceImpl implements HealthService {
	@Autowired
	private HealthDao  healthDao;
	public HealthDao getHealthDao() {
		return healthDao;
	}
	public void setHealthDao(HealthDao healthDao) {
		this.healthDao = healthDao;
	}

	@Override
	public String addInfo(Health addInfo) {
		if(healthDao.insertSelective(addInfo) == 1){
			return "succeed";
		}else
			return "fail";
	}

	@Override
	public List<Health> getAll() {
		List<Health> list = healthDao.getAll();
		return list;
	}

	@Override
	public String delete(String dorm_hea_hno) {
		if (healthDao.deleteByPrimaryKey(dorm_hea_hno) == 1) {  
            return "succeed";
        }  
        return "fail";
	}

	@Override
	public Health findById(String dorm_hea_hno) {
		return healthDao.selectByPrimaryKey(dorm_hea_hno);
	}

	@Override
	public List<Health> findByRno(String dorm_roo_rno) {
		return healthDao.selectByRno(dorm_roo_rno);
	}

	@Override
	public String update(Health updateInfo) {
		if (healthDao.updateByPrimaryKeySelective(updateInfo) == 1) {
			return "succeed";
        }
		return "fail";
	}

}
