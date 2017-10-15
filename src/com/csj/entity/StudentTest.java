package com.csj.entity;


import com.csj.entity.Student;
import com.csj.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.MetadataSources;


import javax.xml.bind.Element;
import java.util.Date;
public class StudentTest{
    //增加
    @Test
    public void add()
    {
        Session session = null;
        try {
            session = HibernateUtil.getSession();
            session.beginTransaction();

            Student s = new Student(22, "HuaChenyu", "male", new Date());
            session.save(s);
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally {
            HibernateUtil.closeSession(session);
        }
    }

    //删除
    @Test
    public void delete()
    {
        Session session = null;
        try{
            session = HibernateUtil.getSession();
            session.beginTransaction();

            Student s = (Student)session.get(Student.class, 2);
            session.delete(s);
            session.getTransaction().commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally {
            HibernateUtil.closeSession(session);
        }
    }

    //修改
    @Test
    public void modify()
    {
        Session session = null;
        try
        {
            session = HibernateUtil.getSession();
            session.beginTransaction();

            Student s = (Student)session.get(Student.class, 1);
            s.setName("WangKai");
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally
        {
            HibernateUtil.closeSession(session);
        }
    }

    //查询
    @Test
    public void query()
    {
        Session session = null;
        try
        {
            session = HibernateUtil.getSession();
            session.beginTransaction();

            String hql = "select count(e) from Student e where e.name = :student_id";
            Query query = session.createQuery(hql).setParameter("student_id","csj");
            Number n = (long)query.uniqueResult();
            int i = n.intValue();
            System.out.println(i);
            //List<Student> list = query.list();
            ///Iterator iterator = list.iterator();
            //while(iterator.hasNext()) {
            //    System.out.println(iterator.next().toString());
           // }
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally
        {
            HibernateUtil.closeSession(session);
        }
    }
}