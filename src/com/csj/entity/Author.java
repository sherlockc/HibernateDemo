package com.csj.entity;

import com.csj.entity.Article;
import org.junit.Test;
import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "t_author")
public class Author {
    @Id
    @Column(name = "author_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Article.class, mappedBy = "author")
    //@JoinTable(name ="author_article", inverseJoinColumns = {@JoinColumn(name = "article_id")}, joinColumns = {@JoinColumn(name = "author_id")})
    private Set<Article> articles;//文章作为多方，我们使用Set集合来存储，同时还能防止存放相同的文章

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setArticles(Set<Article> articles)
    {
        this.articles = articles;
    }

    public Set<Article> getArticles() {
        return articles;
    }

}

