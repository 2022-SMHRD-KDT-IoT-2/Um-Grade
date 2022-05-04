package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Qna {

	private int qna_seq; // 질의응답 일련번호
	private String qna_title; // 질의응답 제목
	private String qna_content; // 질의응답 내용
	private String qna_file; // 질의응답 첨부파일
	private String qna_date; // 질의응답 작성일자
	private String qna_id; // 질의응답 작성자
	
}
