package kr.smhrd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //어노테이션 추가
@AllArgsConstructor
public class Umbbox {

	private int ubox_seq;
	private String ubox_loc;
	private Double ubox_latitude;
	private Double ubox_longitude;
	private String ubox_status;
	private int ubox_qty;
	private String ubox_inst_dt;
	private String admin_id;
	private String ubox_check;
	
}
