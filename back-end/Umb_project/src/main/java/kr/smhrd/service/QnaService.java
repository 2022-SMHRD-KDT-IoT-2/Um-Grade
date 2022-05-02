package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Qna;
import kr.smhrd.mapper.QnaMapper;

@Service
public class QnaService {

	@Autowired
	private QnaMapper mapper;
	
	public List<Qna> selectQna() {
		List<Qna> list = mapper.selectQna();
		return list;
	}
}
