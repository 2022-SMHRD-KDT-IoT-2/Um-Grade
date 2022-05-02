package com.example.dao;

import java.util.List;

import com.example.dto.UmbrellaVO;

public interface UmbrellaDAO {

	public List<UmbrellaVO> selectUmb() throws Exception; // 우산 전체조회용
	
	public UmbrellaVO selectOneUmb(int umb_seq) throws Exception; // 우산 1개 조회
	
	public int insertUmb(UmbrellaVO vo) throws Exception; // 우산 추가
	
	public int deleteUmb(int umb_seq) throws Exception; // 우산 삭제
	
	public int updateUmbRfid(UmbrellaVO vo) throws Exception; // 우산 RFID 수정
	
	public int updateUmbCheck(UmbrellaVO vo) throws Exception; // 우산 점검일자 수정
	
	public int updateUmbBroken(UmbrellaVO vo) throws Exception; // 우산 파손정보 수정
	
}
