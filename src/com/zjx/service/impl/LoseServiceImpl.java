package com.zjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjx.dao.LoseDao;
import com.zjx.model.Lose;
import com.zjx.service.LoseService;
@Service("loseService")
public class LoseServiceImpl implements LoseService {
	@Autowired
	private LoseDao  loseDao;
	public LoseDao getLoseDao() {
		return loseDao;
	}
	public void setLoseDao(LoseDao loseDao) {
		this.loseDao = loseDao;
	}

	@Override
	public String addInfo(Lose addInfo) {
		if(loseDao.insertSelective(addInfo) == 1){
			return "succeed";
		}else
			return "fail";
	}

	@Override
	public List<Lose> getAll() {
		List<Lose> list = loseDao.getAll();
		return list;
	}

	@Override
	public String delete(String dorm_lose_lno) {
		if (loseDao.deleteByPrimaryKey(dorm_lose_lno) == 1) {  
            return "succeed";
        }
        return "fail";
	}

	@Override
	public Lose findById(String dorm_lose_lno) {
		return loseDao.selectByPrimaryKey(dorm_lose_lno);
	}

	@Override
	public String update(Lose updateInfo) {
		if (loseDao.updateByPrimaryKeySelective(updateInfo) == 1) {
			return "succeed";
        }
		return "fail";
	}
	@Override
	public String updateState(Lose updateInfo) {
		String dorm_lose_state = "已领取";
		updateInfo.setDorm_lose_state(dorm_lose_state);
		if (loseDao.updateStateByPrimaryKey(updateInfo) == 1)
			return "succeed";
		else
		 return "fail";
	}
}
