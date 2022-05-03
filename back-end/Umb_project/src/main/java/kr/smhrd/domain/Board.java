package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Board {

	private int article_seq;
	private String article_title;
	private String article_content;
	private String article_date;
	private String article_file;
	private String article_id;
	private int article_cnt;
}
