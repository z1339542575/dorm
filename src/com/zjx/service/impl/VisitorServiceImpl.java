package com.zjx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjx.dao.VisitorDao;
import com.zjx.model.Visitor;
import com.zjx.service.VisitorService;

@Service("visitorService")
public class VisitorServiceImpl implements VisitorService {
	@Autowired
	private VisitorDao visitorDao;
	public VisitorDao getVisitorDao() {
		return visitorDao;
	}
	public void setVisitorDao(VisitorDao visitorDao) {
		this.visitorDao = visitorDao;
	}

	@Override
	public String addInfo(Visitor addInfo) {
		//String dorm_vis_vno = addInfo.getDorm_vis_vno();
		//Visitor vis = visitorDao.selectByPrimaryKey(dorm_vis_vno);
		//if(vis == null){
			if(visitorDao.insertSelective(addInfo) == 1){
				return "succeed";
			}else
				return "fail"; 
		//}else{
		//	return "exist";
		//}
	}

	@Override
	public List<Visitor> getAll() {
		List<Visitor> list = visitorDao.getAll();
		return list;
	}

	@Override
	public String delete(String dorm_vis_vno) {
		if (visitorDao.deleteByPrimaryKey(dorm_vis_vno) == 1) {  
            return "succeed";
        }  
        return "fail";
	}
	@Override
	public Visitor findById(String dorm_vis_vno) {
		return visitorDao.selectByPrimaryKey(dorm_vis_vno);
	}
	
	@Override
	public List<Visitor> findByName(String dorm_vis_name) {
		return visitorDao.selectByName(dorm_vis_name);
	}

	@Override
	public String update(Visitor updateInfo) {
		if (visitorDao.updateByPrimaryKeySelective(updateInfo) == 1) {
			return "succeed";
        }
		return "fail";
	}

}
