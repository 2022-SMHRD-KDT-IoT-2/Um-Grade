package com.example.dto;

import lombok.Data;

@Data
public class BoardVO {

	private int article_seq;
	private String article_title;
	private String article_content;
	private String article_date;
	private String article_file;
	private String article_id;
	private int article_cnt;
	
}
