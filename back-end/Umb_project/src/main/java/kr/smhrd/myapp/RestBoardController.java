package kr.smhrd.myapp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.domain.Board;
import kr.smhrd.mapper.BoardMapper;
import kr.smhrd.service.BoardService;

@RestController
public class RestBoardController {

	@Autowired
//	private BoardMapper mapper;
	private BoardService service;

	// 컨트롤러의 파라미터앞에 @RequestBody 어노테이션
	// 프론트에서 전달 한 json 데이터를 해당 파라미터에 매핑시킨다는 뜻.
	// @ResponseBody : 자바 객체는 HTTP 응답객체로 변환주는데 사용
	@RequestMapping("/boardList.do")
	public ArrayList<Board> boardList() {
		ArrayList<Board> list = service.boardList();
		return list;
	}

	@RequestMapping("/boardContentUpdate.do")
	public String boardContentUpdate(Board vo) {
		service.boardUpdateTW(vo);
		return "boardList";
	}

	@RequestMapping("/boardInsert.do")
	public void boardInsert(Board vo) {
		service.boardInsert(vo);
	}

	@RequestMapping("/boardUpdateTW.do")
	public void boardUpdateTW(Board vo) {
		service.boardUpdateTW(vo);
	}

	@RequestMapping("/boardDelete.do")
	public void boardDelete(int idx) {
		service.boardDelete(idx);
	}
	
}
