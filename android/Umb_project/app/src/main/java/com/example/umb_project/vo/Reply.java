package com.example.umb_project.vo;

public class Reply {

    private int reply_seq; // 답변 일련번호
    private int qna_seq; // 질의응답 원문 일련번호
    private String reply_content; // 답변 내용
    private String reply_date; // 답변 작성일자
    private String reply_file; // 답변 첨부파일
    private String reply_id; // 답변 작성자

    public Reply(int reply_seq, int qna_seq, String reply_content, String reply_date, String reply_file, String reply_id) {
        this.reply_seq = reply_seq;
        this.qna_seq = qna_seq;
        this.reply_content = reply_content;
        this.reply_date = reply_date;
        this.reply_file = reply_file;
        this.reply_id = reply_id;
    }

    public int getReply_seq() {
        return reply_seq;
    }

    public int getQna_seq() {
        return qna_seq;
    }

    public String getReply_content() {
        return reply_content;
    }

    public String getReply_date() {
        return reply_date;
    }

    public String getReply_file() {
        return reply_file;
    }

    public String getReply_id() {
        return reply_id;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "reply_seq=" + reply_seq +
                ", qna_seq=" + qna_seq +
                ", reply_content='" + reply_content + '\'' +
                ", reply_date='" + reply_date + '\'' +
                ", reply_file='" + reply_file + '\'' +
                ", reply_id='" + reply_id + '\'' +
                '}';
    }
}
