package com.csj.test;

import com.csj.entity.Article;
import com.csj.entity.Author;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.util.*;

/*
public class Bidirectional {
    private Session session;

    @Before
    public void before()
    {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("/hibernate.cfg.xml").build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
    }

    @Test
    public void save()
    {

        Author author1 = new Author();
        author1.setName("Li");
        Article article = new Article();
        article.setContent("content1");
        article.setAuthor(author1);
        session.save(article);


        Author author = new Author();
        author.setName("csj");
        Set<Article> articles = new HashSet<Article>();
        for(int i = 0 ; i < 3;i ++) {//添加三篇文章
            Article article = new Article();
            article.setContent("moreContent" + i);
            articles.add(article);
        }
        author.setArticles(articles);
        session.save(author);
    }



     @Test
     public void delete1()
     {
        Article article = session.get(Article.class,70);
        session.delete(article);
    }

    @Test
    public void delete2()
    {
        Author author = session.get(Author.class, 63);
        session.delete(author);
    }

     @Test
     public void hqlDelete1()
     {
        String hql = "DELETE FROM Article WHERE id = ?";
        Query query = session.createQuery(hql);
        query.setParameter(0, 72);
        int result = query.executeUpdate();
        System.out.println("Delete Result: "+ result);
     }

     @Test
     public void hqlDelete2()
     {
        String hql = "DELETE FROM Author WHERE id = ?";
        Query query = session.createQuery(hql);
        query.setParameter(0, 65);
        int result = query.executeUpdate();
        System.out.println("Delete Result: "+ result);
     }

     @After//每一个被注解Test方法在调用后都会调用此方法一次
     public void teardown(){
        session.getTransaction().commit();
        session.close();
     }

}
*/



