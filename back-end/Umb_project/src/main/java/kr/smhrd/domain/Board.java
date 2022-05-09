package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Board {

	private int article_seq; // 커뮤니티 일련번호
	private String article_title; // 커뮤니티 제목
	private String article_content; // 커뮤니티 내용
	private String article_date; // 커뮤니티 작성일자
	private String article_file; // 커뮤니티 첨부파일
	private String article_id; // 커뮤니티 작성자
	private int article_cnt; // 커뮤니티 조회수
}
