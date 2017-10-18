package com.csj.entity;

import com.csj.entity.Author;
import javax.persistence.*;


@Entity
@Table(name = "t_article")
public class Article {
    @Id
    @Column(name = "article_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String content;

    /**
     * @ManyToOne 使用此标签建立多对一关联，此属性在“多”方使用注解在我们的“一”方属性上
     * @cascade 指定级联操作，以数组方式指定，如果只有一个，可以省略“{}”
     * @fetch 定义抓取策略
     * @optional 定义是否为必需属性，如果为必需（false），但在持久化时user = null,则会持久化失败
     * @targetEntity 目标关联对象，默认为被注解属性所在类
     */

    @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY, optional = false, targetEntity = Author.class)
    @JoinColumn(name = "author_id")
    private Author author;


    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }


    public void setAuthor(Author author)
    {
        this.author = author;
    }

     public Author getAuthor()
    {
        return author;
    }

}
