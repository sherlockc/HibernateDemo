package com.csj.test;

import com.csj.entity.Article;
import com.csj.entity.ArticleContent1;
import com.csj.entity.Article1;

import com.csj.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OneToOneTest {
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
       ArticleContent1 articleContent1 = new ArticleContent1();
       articleContent1.setContent("content1");
       Article1 article1 = new Article1();
       article1.setTitle("title1");
       articleContent1.setArticle1(article1);
       article1.setArticleContent1(articleContent1);
       session.save(article1);
    }

    @Test
    public void delete()
    {
        Article1 article1 = session.get(Article1.class, 76);
        session.delete(article1);
    }

    @Test
    public void hqlDelete()
    {
        String hql = "DELETE FROM Article1 WHERE id = ?";
        Query query = session.createQuery(hql).setParameter(0, 78);
        int result = query.executeUpdate();
        System.out.println("Delete result: " + result);
    }


    @After//每一个被注解Test方法在调用后都会调用此方法一次
    public void teardown(){
        session.getTransaction().commit();
        session.close();
    }
}
