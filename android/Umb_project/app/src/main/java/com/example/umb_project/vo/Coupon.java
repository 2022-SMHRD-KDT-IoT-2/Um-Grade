package com.example.umb_project.vo;

public class Coupon {

    private int cp_seq; // 쿠폰 일련번호
    private String cp_no; // 쿠폰 식별코드
    private String cp_date; // 쿠폰 발급일자
    private String cp_done; // 쿠폰 사용여부
    private int cp_amount; // 쿠폰 금액

    public Coupon(int cp_seq, String cp_no, String cp_date, String cp_done, int cp_amount) {
        this.cp_seq = cp_seq;
        this.cp_no = cp_no;
        this.cp_date = cp_date;
        this.cp_done = cp_done;
        this.cp_amount = cp_amount;
    }

    public int getCp_seq() {
        return cp_seq;
    }

    public String getCp_no() {
        return cp_no;
    }

    public String getCp_date() {
        return cp_date;
    }

    public String getCp_done() {
        return cp_done;
    }

    public int getCp_amount() {
        return cp_amount;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "cp_seq=" + cp_seq +
                ", cp_no='" + cp_no + '\'' +
                ", cp_date='" + cp_date + '\'' +
                ", cp_done='" + cp_done + '\'' +
                ", cp_amount=" + cp_amount +
                '}';
    }
}
