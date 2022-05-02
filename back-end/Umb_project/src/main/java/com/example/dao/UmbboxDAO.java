package com.example.dao;

import java.util.List;

import com.example.dto.UmbboxVO;

public interface UmbboxDAO {

	public List<UmbboxVO> selectUbox() throws Exception; // 보관함 전체 조회
}
