import DAO.AulaDAO;
import Models.AulaEntity;

import java.util.List;

public class PruebaHibernate {
    public static void main(String[] args) {
        AulaDAO aulaDao=new AulaDAO();
        List<AulaEntity> aulas=aulaDao.seleccionarAula();
        for(AulaEntity a:aulas){
            System.out.println(a.toString());
        }
    }
}