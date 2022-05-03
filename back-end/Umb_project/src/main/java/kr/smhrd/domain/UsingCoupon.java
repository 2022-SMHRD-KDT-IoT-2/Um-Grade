package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class UsingCoupon {

	private int uc_seq;
	private String uc_id;
	private String uc_date;
	private int cp_seq;
}
