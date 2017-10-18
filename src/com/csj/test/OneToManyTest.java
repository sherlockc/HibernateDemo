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
public class OneToManyTest {
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
        Author author = new Author();
        author.setName("csj");
        Set<Article> articles = new HashSet<Article>();
        for(int i = 0 ; i < 3;i ++){//添加三篇文章
            Article article = new Article();
            article.setContent("moreContent" + i) ;
            articles.add(article);
        }
        author.setArticles(articles);
        session.save(author);
    }

    @Test
    public void update()
    {
        Author author = session.get(Author.class, 32);
        Set<Article> articles = new HashSet<Article>();
        for(int i = 0 ; i < 3;i ++){//添加三篇文章
            Article article = new Article();
            article.setContent("updateContent" + i) ;
            articles.add(article);
        }
        author.setArticles(articles);
        session.update(author);
    }

    @Test
    public void delete()
    {
        Author author = session.get(Author.class, 32);
        session.delete(author);
    }

    @Test
    public void hqlSelect()
    {
        String hql = "SELECT A.articles FROM Author A WHERE A.id = ?";
        Query query = session.createQuery(hql);
        query.setParameter(0, 1);
        List<Article> articles = query.list();
        for(Article article: articles)
            System.out.println("Select Result: "+ article.getId() + article.getContent());
    }

    @Test
    public void hqlDelete()
    {
        String hql = "DELETE FROM Author WHERE id = ?";
        Query query = session.createQuery(hql);
        query.setParameter(0, 40);
        int result = query.executeUpdate();
        System.out.println("Delete Result: "+ result);
    }

    @Test
    public void hqlUpdate()
    {

        String hql = "UPDATE Author A SET = ?  WHERE A.article.id = ?";
        Query query = session.createQuery(hql);
        query.setParameter(0, "Changed");
        int result = query.executeUpdate();
        System.out.println("Update Result: "+ result);

    }

    @After//每一个被注解Test方法在调用后都会调用此方法一次
    public void teardown(){
        session.getTransaction().commit();
        session.close();
    }

}
*/


