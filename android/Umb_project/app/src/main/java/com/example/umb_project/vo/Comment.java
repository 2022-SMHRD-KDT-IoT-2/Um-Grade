package com.example.umb_project.vo;

public class Comment {

    private int cmt_seq; // 댓글 일련번호
    private int article_seq; // 커뮤니티 원문 번호
    private String cmt_content; // 댓글 내용
    private String cmt_date; // 댓글 작성일자
    private String cmt_id; // 댓글 작성자
    private int cmt_likes; // 댓글 좋아요 수

    public Comment(int cmt_seq, int article_seq, String cmt_content, String cmt_date, String cmt_id, int cmt_likes) {
        this.cmt_seq = cmt_seq;
        this.article_seq = article_seq;
        this.cmt_content = cmt_content;
        this.cmt_date = cmt_date;
        this.cmt_id = cmt_id;
        this.cmt_likes = cmt_likes;
    }

    public int getCmt_seq() {
        return cmt_seq;
    }

    public int getArticle_seq() {
        return article_seq;
    }

    public String getCmt_content() {
        return cmt_content;
    }

    public String getCmt_date() {
        return cmt_date;
    }

    public String getCmt_id() {
        return cmt_id;
    }

    public int getCmt_likes() {
        return cmt_likes;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cmt_seq=" + cmt_seq +
                ", article_seq=" + article_seq +
                ", cmt_content='" + cmt_content + '\'' +
                ", cmt_date='" + cmt_date + '\'' +
                ", cmt_id='" + cmt_id + '\'' +
                ", cmt_likes=" + cmt_likes +
                '}';
    }
}
