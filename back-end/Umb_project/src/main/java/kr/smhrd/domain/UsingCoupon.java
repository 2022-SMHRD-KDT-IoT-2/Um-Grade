package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class UsingCoupon {

	private int uc_seq; // 사용쿠폰 일련번호
	private String uc_id; // 사용쿠폰 식별코드
	private String uc_date; // 쿠폰 사용일자
	private int cp_seq; // 쿠폰 일련번호
}
