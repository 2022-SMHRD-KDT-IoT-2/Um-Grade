package com.example.umb_project.vo;

public class Board {

    private int article_seq; // 커뮤니티 일련번호
    private String article_title; // 커뮤니티 제목
    private String article_content; // 커뮤니티 내용
    private String article_date; // 커뮤니티 작성일자
    private String article_file; // 커뮤니티 첨부파일
    private String article_id; // 커뮤니티 작성자
    private int article_cnt; // 커뮤니티 조회수

    public Board(int article_seq, String article_title, String article_content, String article_date, String article_file, String article_id, int article_cnt) {
        this.article_seq = article_seq;
        this.article_title = article_title;
        this.article_content = article_content;
        this.article_date = article_date;
        this.article_file = article_file;
        this.article_id = article_id;
        this.article_cnt = article_cnt;
    }

    public int getArticle_seq() {
        return article_seq;
    }

    public String getArticle_title() {
        return article_title;
    }

    public String getArticle_content() {
        return article_content;
    }

    public String getArticle_date() {
        return article_date;
    }

    public String getArticle_file() {
        return article_file;
    }

    public String getArticle_id() {
        return article_id;
    }

    public int getArticle_cnt() {
        return article_cnt;
    }

    @Override
    public String toString() {
        return "Board{" +
                "article_seq=" + article_seq +
                ", article_title='" + article_title + '\'' +
                ", article_content='" + article_content + '\'' +
                ", article_date='" + article_date + '\'' +
                ", article_file='" + article_file + '\'' +
                ", article_id='" + article_id + '\'' +
                ", article_cnt=" + article_cnt +
                '}';
    }
}
