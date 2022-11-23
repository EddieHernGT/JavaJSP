import DAO.AulaDAO;
import Models.AulaEntity;

import java.util.List;

public class PruebaHibernate {
    public static void main(String[] args) {
        AulaDAO aulaDao=new AulaDAO();
        List<AulaEntity> dayana=aulaDao.seleccionarAula();
        for(AulaEntity a: dayana){
            System.out.println(a.toString());
        }
        AulaEntity aula=aulaDao.obtenerAula(2);
        System.out.println(aula.toString());
    }
}