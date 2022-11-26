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
        List<AulaEntity> aulas=new ArrayList<AulaEntity>();
        SessionFactory sessFac= HibernateUtil.getSessionFactory();
        Session session=sessFac.getCurrentSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();
            aulas=session.createQuery("SELECT a from AulaEntity a",AulaEntity.class).getResultList();
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
    public AulaEntity obtenerAula(int numAula){
        AulaEntity aula=new AulaEntity();
        SessionFactory sessFac= HibernateUtil.getSessionFactory();
        Session session=sessFac.getCurrentSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();
            aula= session.get(AulaEntity.class,numAula);
        }catch (Exception e){
            if(tr!=null){
                tr.rollback();
            }
            e.printStackTrace();
            aula=null;
        }finally {
            session.close();
            sessFac.close();
        }
        return aula;
    }
    public boolean crearAula(int numaula,String nombre,int capacidad,String descripcion){
        SessionFactory sessFac= HibernateUtil.getSessionFactory();
        Session session=sessFac.getCurrentSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();
            AulaEntity aula=new AulaEntity();
            aula.setNumAula(numaula);
            aula.setNombre(nombre);
            aula.setCapacidad(capacidad);
            aula.setDescripcion(descripcion);

            session.save(aula);
            tr.commit();
            return true;
        }catch (Exception e){
            if(tr!=null){
                tr.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
            sessFac.close();
        }
        return false;
    }
    public boolean actualizarAula(int numaula,String nombre,int capacidad,String descripcion){
        SessionFactory sessFac= HibernateUtil.getSessionFactory();
        Session session=sessFac.getCurrentSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();
            AulaEntity aula=session.get(AulaEntity.class,numaula);
            aula.setNombre(nombre);
            aula.setCapacidad(capacidad);
            aula.setDescripcion(descripcion);
            session.update(aula);
            tr.commit();
            return true;
        }catch (Exception e){
            if(tr!=null){
                tr.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
            sessFac.close();
        }
        return false;
    }
    public boolean borrarAula(int numaula){
        SessionFactory sessFac= HibernateUtil.getSessionFactory();
        Session session=sessFac.getCurrentSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();
            AulaEntity aula=session.get(AulaEntity.class,numaula);
            session.delete(aula);
            tr.commit();
            return true;
        }catch (Exception e){
            if(tr!=null){
                tr.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
            sessFac.close();
        }
        return false;
    }
}
