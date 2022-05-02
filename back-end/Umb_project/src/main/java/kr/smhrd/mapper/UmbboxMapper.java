package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Umbbox;

public interface UmbboxMapper {
	@Select("select * from t_umbbox")
	public List<Umbbox> selectUbox();
	
}
