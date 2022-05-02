package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.User;

public interface UserMapper {

	@Select("select * from t_user")
	public List<User> selectUser();
}
