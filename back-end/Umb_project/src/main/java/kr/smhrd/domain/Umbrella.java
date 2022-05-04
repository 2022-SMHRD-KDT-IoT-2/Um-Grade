package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Umbrella {

	private int umb_seq; // 우산일련번호
	private int ubox_seq; // 우산보관함 일련번호(현재 우산이 위치한 보관함)
	private String umb_status; // 우산 대여상태
	private String umb_broken; // 우산 파손상태
	private String umb_rfid; // 우산 RFID
	private String umb_type; // 우산 종류
	private String umb_check; // 우산 점검일자
	private String umb_reg_dt; // 우산 등록일자
	
}
