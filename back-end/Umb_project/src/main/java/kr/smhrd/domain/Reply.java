package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Reply {

	private int reply_seq; // 답변 일련번호
	private int qna_seq; // 질의응답 원문 일련번호
	private String reply_content; // 답변 내용
	private String reply_date; // 답변 작성일자
	private String reply_file; // 답변 첨부파일
	private String reply_id; // 답변 작성자

	
}
