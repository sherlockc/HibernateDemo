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
public class ManyToOneTest {
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
        author.setName("Da");
        Article article = new Article();
        article.setContent("content3");
        article.setAuthor(author);
        session.save(article);
    }

    @Test
    public void update()
    {

    }

    @Test
    public void delete()
    {
        Article article = session.get(Article.class, 46);
        session.delete(article);
    }



    @Test
    public void hqlDelete()
    {
        String hql = "DELETE FROM Article WHERE id = ?";
        Query query = session.createQuery(hql);
        query.setParameter(0, 48);
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


