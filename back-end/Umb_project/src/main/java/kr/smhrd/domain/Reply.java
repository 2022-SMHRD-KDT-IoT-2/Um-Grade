package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Reply {

	private int reply_seq;
	private int qna_seq;
	private String reply_content;
	private String reply_date;
	private String reply_file;
	private String reply_id;

	
}
