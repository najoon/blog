package com.tandu.blog.persistance;

import java.util.List;

import com.tandu.blog.model.IntroductionsVO;

public interface IntroductionsDao {
	
	public List<IntroductionsVO> selectAll();
	public IntroductionsVO findById(String u_seq);
	public int insert(IntroductionsVO introductionsVO);
	public int update(IntroductionsVO introductionsVO);
	public int delete(String u_seq);
	
	public void create_introductions_table();

}
