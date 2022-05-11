package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Umbbox {

	private int ubox_seq; // 보관함 일련번호
	private String ubox_loc; // 보관함 설치장소명
	private Double ubox_latitude; // 위도
	private Double ubox_longitude; // 경도
	private String ubox_status; // 보관함 상태
	private int ubox_qty; // 보관함 수량
	private String ubox_inst_dt; // 보관함 설치일자
	private String admin_id; // 보관함 관리자
	private String ubox_check; // 보관함 점검일자
	private String ubox_id; // 사용자 ID
	
}
