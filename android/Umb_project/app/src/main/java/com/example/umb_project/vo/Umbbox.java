package com.example.umb_project.vo;

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

    public Umbbox(int ubox_seq, String ubox_loc, Double ubox_latitude, Double ubox_longitude, String ubox_status, int ubox_qty, String ubox_inst_dt, String admin_id, String ubox_check) {
        this.ubox_seq = ubox_seq;
        this.ubox_loc = ubox_loc;
        this.ubox_latitude = ubox_latitude;
        this.ubox_longitude = ubox_longitude;
        this.ubox_status = ubox_status;
        this.ubox_qty = ubox_qty;
        this.ubox_inst_dt = ubox_inst_dt;
        this.admin_id = admin_id;
        this.ubox_check = ubox_check;
    }

    public int getUbox_seq() {
        return ubox_seq;
    }

    public String getUbox_loc() {
        return ubox_loc;
    }

    public Double getUbox_latitude() {
        return ubox_latitude;
    }

    public Double getUbox_longitude() {
        return ubox_longitude;
    }

    public String getUbox_status() {
        return ubox_status;
    }

    public int getUbox_qty() {
        return ubox_qty;
    }

    public String getUbox_inst_dt() {
        return ubox_inst_dt;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public String getUbox_check() {
        return ubox_check;
    }

    @Override
    public String toString() {
        return "Umbbox{" +
                "ubox_seq=" + ubox_seq +
                ", ubox_loc='" + ubox_loc + '\'' +
                ", ubox_latitude=" + ubox_latitude +
                ", ubox_longitude=" + ubox_longitude +
                ", ubox_status='" + ubox_status + '\'' +
                ", ubox_qty=" + ubox_qty +
                ", ubox_inst_dt='" + ubox_inst_dt + '\'' +
                ", admin_id='" + admin_id + '\'' +
                ", ubox_check='" + ubox_check + '\'' +
                '}';
    }
}
