package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Board;
import kr.smhrd.domain.Comment;


public interface CommentMapper {

	@Select("select * from t_comment")
	public List<Comment> selectCmt();
	
}
