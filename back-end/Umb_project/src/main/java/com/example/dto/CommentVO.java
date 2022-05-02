package com.example.dto;

import lombok.Data;

@Data
public class CommentVO {

	private int cmt_seq;
	private int article_seq;
	private String cmt_content;
	private String cmt_date;
	private String cmt_id;
	private int cmt_likes;
	
}
