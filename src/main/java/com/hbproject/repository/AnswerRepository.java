package com.hbproject.repository;

import com.hbproject.domain.Answer;
import com.hbproject.domain.Question;
import com.hbproject.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AnswerRepository {

    // answer lari save etmek icin
    public void saveAnswer(Answer answer) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(answer);

        tx.commit();
        session.close();

    }


}
