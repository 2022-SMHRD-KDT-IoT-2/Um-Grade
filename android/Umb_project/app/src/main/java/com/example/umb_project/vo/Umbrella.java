package com.example.umb_project.vo;

public class Umbrella {

    private int umb_seq; // 우산일련번호
    private int ubox_seq; // 우산보관함 일련번호(현재 우산이 위치한 보관함)
    private String umb_status; // 우산 대여상태
    private String umb_broken; // 우산 파손상태
    private String umb_rfid; // 우산 RFID
    private String umb_type; // 우산 종류
    private String umb_check; // 우산 점검일자
    private String umb_reg_dt; // 우산 등록일자



    public Umbrella(int umb_seq, int ubox_seq, String umb_status, String umb_broken, String umb_rfid, String umb_type, String umb_check, String umb_reg_dt) {
        this.umb_seq = umb_seq;
        this.ubox_seq = ubox_seq;
        this.umb_status = umb_status;
        this.umb_broken = umb_broken;
        this.umb_rfid = umb_rfid;
        this.umb_type = umb_type;
        this.umb_check = umb_check;
        this.umb_reg_dt = umb_reg_dt;
    }

    public int getUmb_seq() {
        return umb_seq;
    }

    public int getUbox_seq() {
        return ubox_seq;
    }

    public String getUmb_status() {
        return umb_status;
    }

    public String getUmb_broken() {
        return umb_broken;
    }

    public String getUmb_rfid() {
        return umb_rfid;
    }

    public String getUmb_type() {
        return umb_type;
    }

    public String getUmb_check() {
        return umb_check;
    }

    public String getUmb_reg_dt() {
        return umb_reg_dt;
    }

    @Override
    public String toString() {
        return "Umbrella{" +
                "umb_seq=" + umb_seq +
                ", ubox_seq=" + ubox_seq +
                ", umb_status='" + umb_status + '\'' +
                ", umb_broken='" + umb_broken + '\'' +
                ", umb_rfid='" + umb_rfid + '\'' +
                ", umb_type='" + umb_type + '\'' +
                ", umb_check='" + umb_check + '\'' +
                ", umb_reg_dt='" + umb_reg_dt + '\'' +
                '}';
    }
}
