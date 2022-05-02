package com.example.dto;

import lombok.Data;

@Data
public class ReplyVO {
	
	private int reply_seq;
	private int qna_seq;
	private String reply_content;
	private String reply_date;
	private String reply_file;
	private String reply_id;
	
}
