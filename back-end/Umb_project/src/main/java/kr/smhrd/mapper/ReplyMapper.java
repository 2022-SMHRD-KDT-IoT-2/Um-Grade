package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Reply;


public interface ReplyMapper {

	@Select("select * from t_reply")
	public List<Reply> selectReply();
	
}
