package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Qna {

	private int qna_seq;
	private String qna_title;
	private String qna_content;
	private String qna_file;
	private String qna_date;
	private String qna_id;
	
}
