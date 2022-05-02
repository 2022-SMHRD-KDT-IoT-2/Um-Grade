package com.example.dao;

import java.util.List;

import com.example.dto.RentVO;

public interface RentDAO {

	public List<RentVO> selectRent() throws Exception;
}
