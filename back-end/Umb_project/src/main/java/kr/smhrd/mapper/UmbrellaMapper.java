package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Umbrella;


public interface UmbrellaMapper {

	@Select("select * from t_umbrella")
	public List<Umbrella> selectUmb();
	
}
