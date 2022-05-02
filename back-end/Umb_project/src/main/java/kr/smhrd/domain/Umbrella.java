package kr.smhrd.domain;

import lombok.Data;

@Data
public class Umbrella {

	private int umb_seq;
	private int ubox_seq;
	private String umb_status;
	private String umb_broken;
	private String umb_rfid;
	private String umb_type;
	private String umb_check;
	private String umb_reg_dt;
	
}
