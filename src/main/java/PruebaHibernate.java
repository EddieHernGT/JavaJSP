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

        //aulaDao.crearAula(100,"Aula de prueba",100,"Esto es un aula de prueba");
        //aulaDao.actualizarAula(11,"Aula de prueba modificado",50,"Prueba de aula actualizada");
        aulaDao.borrarAula(11);
    }
}