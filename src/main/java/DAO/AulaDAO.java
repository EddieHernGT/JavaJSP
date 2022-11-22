package DAO;

import java.util.ArrayList;
import java.util.List;
import Models.AulaEntity;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AulaDAO {
    public List<AulaEntity> seleccionarAula(){
        List<AulaEntity> aulas= new ArrayList<AulaEntity>();
        SessionFactory sessFac= HibernateUtil.getSessionFactory();
        Session session=sessFac.getCurrentSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();
            aulas=session.createQuery("SELECT a from Aula a",AulaEntity.class).getResultList();
        }catch (Exception e){
            if(tr!=null){
                tr.rollback();
            }
            e.printStackTrace();
            aulas=null;
        }finally {
            session.close();
            sessFac.close();
        }
        return aulas;
    }
}
