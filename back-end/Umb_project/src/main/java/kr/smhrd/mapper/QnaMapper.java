package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Qna;

public interface QnaMapper {

	@Select("select * from t_qna")
	public List<Qna> selectQna();
}
