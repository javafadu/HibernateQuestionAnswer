package com.hbproject.repository;

import com.hbproject.domain.Question;
import com.hbproject.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class QuestionRepository {

    // question lari save etmek icin
    public void saveQuestion(Question question) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(question);

        tx.commit();
        session.close();

    }


    // question lari get etmek icin
    public Question getQuestion(Integer id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Question foundQuestion = session.get(Question.class, id);

        tx.commit();
        session.close();

        return foundQuestion;

    }

    // questionlari id lerine gore silme

    public void removeQuestion(Question question){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.remove(question);

        tx.commit();
        session.close();

    }


}
