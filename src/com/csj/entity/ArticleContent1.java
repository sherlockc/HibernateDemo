package com.csj.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "t_articleContent1")
public class ArticleContent1 {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name = "foreignKey" ,//生成器名称
            strategy = "foreign",//使用hibernate的外键策略
            parameters = @Parameter(value = "article1", name = "property"))//指定成员属性中的article所在类的主键为本类的主键,这里的参数属性name必须为"property"
    @GeneratedValue(generator = "foreignKey")//使用上述定义的id生成器
    @Column(name = "articleContent1_id")
    private int id;

    private String content;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Article1 article1;


    public int getId()
    {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Article1 getArticle1() {
        return article1;
    }

    public void setArticle1(Article1 article1) {
        this.article1 = article1;
    }
}
