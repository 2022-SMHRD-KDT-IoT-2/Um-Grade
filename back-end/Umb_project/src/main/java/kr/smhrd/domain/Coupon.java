package kr.smhrd.domain;

import lombok.Data;

@Data
public class Coupon {

	private int cp_seq;
	private String cp_no;
	private String cp_date;
	private String cp_done;
	private int cp_amount;
	
}
