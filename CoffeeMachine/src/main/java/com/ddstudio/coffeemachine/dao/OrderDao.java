package com.ddstudio.coffeemachine.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ddstudio.coffeemachine.vo.DrinkVo;
import com.ddstudio.coffeemachine.vo.OrderVo;
import com.ddstudio.coffeemachine.vo.RoomVo;

@Repository
public class OrderDao {
	@Autowired
    private SqlSessionTemplate sqlSession;
	
	
	public List<DrinkVo> getAllDrinks(){
		return sqlSession.selectList("DrinkVoMapper.selectAll");
	}
	
	public int order(OrderVo orderVo){
		int lastInsertId = sqlSession.insert("OrderVoMapper.insertOrder", orderVo);
		
		return lastInsertId;
	}
	
	public int getCurrentRoom() {
		int currentRoomId = 0;
		
		RoomVo roomVo = sqlSession.selectOne("RoomVoMapper.selectLast");
		
		if(roomVo != null){
			currentRoomId = roomVo.roomId;
		}
		
		if (currentRoomId == 0 || roomVo.finishedTime == null || roomVo.isFinished == false) {
			currentRoomId = sqlSession.insert("RoomVoMapper.insert");
		}
		
		return currentRoomId;
	}
	
	
	public List<OrderVo> getOrders(int roomId) {
		return sqlSession.selectList("OrderVoMapper.selectOrders", roomId);
	}
}
