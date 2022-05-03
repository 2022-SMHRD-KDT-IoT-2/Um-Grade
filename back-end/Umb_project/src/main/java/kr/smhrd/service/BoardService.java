package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Board;
import kr.smhrd.mapper.BoardMapper;
import kr.smhrd.mapper.CouponMapper;

@Service
public class BoardService {

	@Autowired
	private BoardMapper mapper;
	
	public List<Board> selectBoard(){
		List<Board> list = mapper.selectBoard();
		return list;
	}
}
