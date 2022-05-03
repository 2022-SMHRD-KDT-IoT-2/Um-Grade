package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Board;


public interface BoardMapper {

	@Select("select * from t_board")
	public List<Board> selectBoard();
	
}
