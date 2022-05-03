package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Coupon {

	private int cp_seq;
	private String cp_no;
	private String cp_date;
	private String cp_done;
	private int cp_amount;
	
}
