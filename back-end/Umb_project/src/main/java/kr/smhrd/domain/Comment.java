package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Comment {

	private int cmt_seq;
	private int article_seq;
	private String cmt_content;
	private String cmt_date;
	private String cmt_id;
	private int cmt_likes;
	
}
