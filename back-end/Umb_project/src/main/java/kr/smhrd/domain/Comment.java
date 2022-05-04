package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Comment {

	private int cmt_seq; // 댓글 일련번호
	private int article_seq; // 커뮤니티 원문 번호
	private String cmt_content; // 댓글 내용
	private String cmt_date; // 댓글 작성일자
	private String cmt_id; // 댓글 작성자
	private int cmt_likes; // 댓글 좋아요 수
	
}
