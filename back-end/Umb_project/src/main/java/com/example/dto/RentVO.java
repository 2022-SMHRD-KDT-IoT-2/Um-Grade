package com.example.dto;

import lombok.Data;

@Data
public class RentVO {
	private int rent_seq;
	private String rent_id;
	private int umb_seq;
	private String rent_s_date;
	private String rent_e_date;
	private String pay_method;
	private int pay_amount;
	private String pay_done;
}
