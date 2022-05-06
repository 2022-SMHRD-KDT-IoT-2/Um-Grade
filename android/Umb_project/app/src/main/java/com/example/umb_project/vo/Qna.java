package com.example.umb_project.vo;

public class Qna {

    private int qna_seq; // 질의응답 일련번호
    private String qna_title; // 질의응답 제목
    private String qna_content; // 질의응답 내용
    private String qna_file; // 질의응답 첨부파일
    private String qna_date; // 질의응답 작성일자
    private String qna_id; // 질의응답 작성자

    public Qna(int qna_seq, String qna_title, String qna_content, String qna_file, String qna_date, String qna_id) {
        this.qna_seq = qna_seq;
        this.qna_title = qna_title;
        this.qna_content = qna_content;
        this.qna_file = qna_file;
        this.qna_date = qna_date;
        this.qna_id = qna_id;
    }

    public int getQna_seq() {
        return qna_seq;
    }

    public String getQna_title() {
        return qna_title;
    }

    public String getQna_content() {
        return qna_content;
    }

    public String getQna_file() {
        return qna_file;
    }

    public String getQna_date() {
        return qna_date;
    }

    public String getQna_id() {
        return qna_id;
    }

    @Override
    public String toString() {
        return "Qna{" +
                "qna_seq=" + qna_seq +
                ", qna_title='" + qna_title + '\'' +
                ", qna_content='" + qna_content + '\'' +
                ", qna_file='" + qna_file + '\'' +
                ", qna_date='" + qna_date + '\'' +
                ", qna_id='" + qna_id + '\'' +
                '}';
    }
}
