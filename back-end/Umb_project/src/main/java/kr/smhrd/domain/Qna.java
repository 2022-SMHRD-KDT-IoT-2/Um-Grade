package kr.smhrd.domain;

import lombok.Data;

@Data
public class Qna {

	private int qna_seq;
	private String qna_title;
	private String qna_content;
	private String qna_file;
	private String qna_date;
	private String qna_id;
	
}