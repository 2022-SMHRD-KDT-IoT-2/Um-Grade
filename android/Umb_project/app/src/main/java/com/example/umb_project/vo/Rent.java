package com.example.umb_project.vo;

public class Rent {

    private int rent_seq; // 대여 일련번호
    private String rent_id; // 대여자
    private int umb_seq; // 우산번호
    private String rent_s_date; // 대여일자
    private String rent_e_date; // 반납일자
    private String pay_method; // 결제수단
    private int pay_amount; // 결제금액
    private String pay_done; // 결제여부



    public int getRent_seq() {
        return rent_seq;
    }

    public String getRent_id() {
        return rent_id;
    }

    public int getUmb_seq() {
        return umb_seq;
    }

    public String getRent_s_date() {
        return rent_s_date;
    }

    public String getRent_e_date() {
        return rent_e_date;
    }

    public String getPay_method() {
        return pay_method;
    }

    public int getPay_amount() {
        return pay_amount;
    }

    public String getPay_done() {
        return pay_done;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "rent_seq=" + rent_seq +
                ", rent_id='" + rent_id + '\'' +
                ", umb_seq=" + umb_seq +
                ", rent_s_date='" + rent_s_date + '\'' +
                ", rent_e_date='" + rent_e_date + '\'' +
                ", pay_method='" + pay_method + '\'' +
                ", pay_amount=" + pay_amount +
                ", pay_done='" + pay_done + '\'' +
                '}';
    }
}
