package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Rent {

	private int rent_seq; // 대여 일련번호
	private String rent_id; // 대여자
	private int umb_seq; // 우산번호
	private String rent_s_date; // 대여일자
	private String rent_e_date; // 반납일자
	private String pay_method; // 결제수단
	private int pay_amount; // 결제금액
	private String pay_done; // 결제여부
	
	
}
