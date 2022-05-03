package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Rent {

	private int rent_seq;
	private String rent_id;
	private int umb_seq;
	private String rent_s_date;
	private String rent_e_date;
	private String pay_method;
	private int pay_amount;
	private String pay_done;
	
	
}
