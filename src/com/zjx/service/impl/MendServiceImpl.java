package com.zjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjx.dao.MendDao;
import com.zjx.model.Mend;
import com.zjx.service.MendService;
@Service("mendService")
public class MendServiceImpl implements MendService {
	@Autowired
	private MendDao  mendDao;
	public MendDao getMendDao() {
		return mendDao;
	}
	public void setMendDao(MendDao mendDao) {
		this.mendDao = mendDao;
	}

	@Override
	public String addInfo(Mend addInfo) {
		if(mendDao.insertSelective(addInfo) == 1){
			return "succeed";
		}else
			return "fail";
	}
	@Override
	public List<Mend> getAll() {
		List<Mend> list = mendDao.getAll();
		return list;
	}

	@Override
	public String delete(String dorm_men_mno) {
		if (mendDao.deleteByPrimaryKey(dorm_men_mno) == 1) {  
            return "succeed";
        }  
        return "fail";
	}

	@Override
	public Mend findById(String dorm_men_mno) {
		return mendDao.selectByPrimaryKey(dorm_men_mno);
	}

	@Override
	public List<Mend> findByState(String dorm_men_state) {
		return mendDao.selectByState(dorm_men_state);
	}

	@Override
	public String update(Mend updateInfo) {
		if (mendDao.updateByPrimaryKeySelective(updateInfo) == 1) {
			return "succeed";
        }
		return "fail";
	}
	@Override
	public String updateState(Mend updateInfo) {
		String dorm_lose_state = "已受理";
		updateInfo.setDorm_men_state(dorm_lose_state);
		if (mendDao.updateStateByPrimaryKey(updateInfo) == 1)
			return "succeed";
		else
		 return "fail";
	}

}
