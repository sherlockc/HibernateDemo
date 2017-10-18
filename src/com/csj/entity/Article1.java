package com.csj.entity;

import com.csj.entity.ArticleContent1;
import javax.persistence.*;

@Entity
@Table(name = "t_article1")
public class Article1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "article1_id")
    private int id;

    private String title;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = ArticleContent1.class)
    @PrimaryKeyJoinColumn
    private ArticleContent1 articleContent1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArticleContent1 getArticleContent1() {
        return articleContent1;
    }

    public void setArticleContent1(ArticleContent1 articleContent1) {
        this.articleContent1 = articleContent1;
    }
}
