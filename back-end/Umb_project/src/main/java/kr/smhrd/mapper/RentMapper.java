package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Rent;


public interface RentMapper {

	@Select("select * from t_rent")
	public List<Rent> selectRent();
	
}
