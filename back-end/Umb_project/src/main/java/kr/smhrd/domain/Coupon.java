package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Coupon {

	private int cp_seq; // 쿠폰 일련번호
	private String cp_no; // 쿠폰 식별코드
	private String cp_date; // 쿠폰 발급일자
	private String cp_done; // 쿠폰 사용여부
	private int cp_amount; // 쿠폰 금액
	
}
