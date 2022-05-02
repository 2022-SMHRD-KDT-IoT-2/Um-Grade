package kr.smhrd.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Board;
import kr.smhrd.mapper.BoardMapper;

@Service
public class BoardService {
	
	@Autowired
	private BoardMapper mapper;

	// 컨트롤러의 파라미터앞에 @RequestBody 어노테이션
	// 프론트에서 전달 한 json 데이터를 해당 파라미터에 매핑시킨다는 뜻.
	// @ResponseBody : 자바 객체는 HTTP 응답객체로 변환주는데 사용
	public ArrayList<Board> boardList() {
		ArrayList<Board> list = mapper.boardList();
		return list;
	}

	public String boardContentUpdate(Board vo) {
		mapper.boardUpdate(vo);
		return "boardList";
	}

	public void boardInsert(Board vo) {
		mapper.boardInsert(vo);
	}

	public void boardUpdateTW(Board vo) {
		mapper.boardUpdateTW(vo);
	}

	public void boardDelete(int idx) {
		mapper.boardDelete(idx);
	}

}
