package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Rfid {
	private int rfid_seq; // 로그 일련번호
	private String rfid_uid; // 로그 일련번호
	private String rfid_date;
}
