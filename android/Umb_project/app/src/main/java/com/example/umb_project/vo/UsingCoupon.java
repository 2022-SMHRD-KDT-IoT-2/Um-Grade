package com.example.umb_project.vo;

public class UsingCoupon {

    private int uc_seq; // 사용쿠폰 일련번호
    private String uc_id; // 사용쿠폰 식별코드
    private String uc_date; // 쿠폰 사용일자
    private int cp_seq; // 쿠폰 일련번호

    public UsingCoupon(int uc_seq, String uc_id, String uc_date, int cp_seq) {
        this.uc_seq = uc_seq;
        this.uc_id = uc_id;
        this.uc_date = uc_date;
        this.cp_seq = cp_seq;
    }

    public int getUc_seq() {
        return uc_seq;
    }

    public String getUc_id() {
        return uc_id;
    }

    public String getUc_date() {
        return uc_date;
    }

    public int getCp_seq() {
        return cp_seq;
    }

    @Override
    public String toString() {
        return "UsingCoupon{" +
                "uc_seq=" + uc_seq +
                ", uc_id='" + uc_id + '\'' +
                ", uc_date='" + uc_date + '\'' +
                ", cp_seq=" + cp_seq +
                '}';
    }
}
