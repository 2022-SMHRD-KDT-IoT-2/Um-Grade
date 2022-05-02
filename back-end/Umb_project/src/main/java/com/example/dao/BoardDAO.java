package com.example.dao;

import java.util.List;

import com.example.dto.BoardVO;

public interface BoardDAO {

	public List<BoardVO> selectBoard() throws Exception;
}
