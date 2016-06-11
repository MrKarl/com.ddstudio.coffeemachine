package com.ddstudio.coffeemachine.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ddstudio.coffeemachine.vo.RoomVo;

@Repository
public class OrderDao {
	
	@Autowired
    private SqlSessionTemplate sqlSession;
	
	public void insertRoom(RoomVo roomVo) {
		sqlSession.insert("RoomVoMapper.insertRoom", roomVo);
	}
	
	
	public void orderComplete() {
		
	}
	
	public void order() {
		
	}
	
	public void cancelOrder() {
		
	}
}
