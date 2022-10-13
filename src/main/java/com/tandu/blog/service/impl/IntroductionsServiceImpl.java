package com.tandu.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tandu.blog.model.IntroductionsVO;
import com.tandu.blog.persistance.IntroductionsDao;
import com.tandu.blog.service.IntroductionsService;

@Service
public class IntroductionsServiceImpl implements IntroductionsService{

	@Autowired
	IntroductionsDao introductionsDao;
	
	@Override
	public List<IntroductionsVO> selectAll() {
		// TODO Auto-generated method stub
		return introductionsDao.selectAll();
	}

	@Override
	public IntroductionsVO findById(String u_seq) {
		// TODO Auto-generated method stub
		return introductionsDao.findById(u_seq);
	}

	@Override
	public int insert(IntroductionsVO introductionsVO) {
		// TODO Auto-generated method stub
		return introductionsDao.insert(introductionsVO);
	}

	@Override
	public int update(IntroductionsVO introductionsVO) {
		// TODO Auto-generated method stub
		return introductionsDao.update(introductionsVO);
	}

	@Override
	public int delete(String u_seq) {
		// TODO Auto-generated method stub
		return introductionsDao.delete(u_seq);
	}

	@Override
	public void create_introductions_table() {

		
	}

}
