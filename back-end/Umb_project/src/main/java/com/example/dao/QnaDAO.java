package com.example.dao;

import java.util.List;

import com.example.dto.QnaVO;

public interface QnaDAO {

	public List<QnaVO> selectQna() throws Exception;
}
