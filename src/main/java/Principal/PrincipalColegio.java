
package Principal;
//CLASE PARA CONECTARNOS A LA BD
import com.mongodb.*;
import Modelos.*;
import BD_Mongo.*;
import java.util.ArrayList;
import java.util.List;

public class PrincipalColegio {

    public static void main(String[] args) {

        ArrayList<Profesor> profesores = new ArrayList<>();
        profesores.add(new Profesor("76341242", "RAFAEL", "CORDOVA","EA452",
                new ArrayList<>(List.of("GEOMETRIA","ARITMETICA"))));
        profesores.add(new Profesor("09864222", "ALFREDO", "CALERIN","RT425",
                new ArrayList<>(List.of("ALGEBRA"))));
        profesores.add(new Profesor("25652321", "OMAR", "CABALLERO","MP513",
                new ArrayList<>(List.of("ARITMETICA"))));
        profesores.add(new Profesor("41324565", "GERSON", "CANALES","LP451",
                new ArrayList<>(List.of("GEOMETRIA","ARITMETICA","ALGEBRA"))));
        profesores.add(new Profesor("65215412", "CARLOS", "CHALONCA","PA123",
                new ArrayList<>(List.of("GEOMETRIA","QUIMICA"))));
        profesores.add(new Profesor("81941243", "NEHIL", "VARA", "AM341",
                new ArrayList<>(List.of("TRIGONOMETRIA","ALGEBRA","FISICA"))));
        profesores.add(new Profesor("82352353", "LUFER", "VARA", "AM341",
                new ArrayList<>(List.of("TRIGONOMETRIA","ALGEBRA","FISICA"))));
/*
        try{
            // PASO 4.1: "CREATE" -> Metemos los objetos PROFESOR en la coleccion PROFESORES
			for (Profesor prof : profesores) {
				BD_Mongo.Conexion.collection.insert(prof.toDBObjectProfesor());
											}
           Conexion.getInstance("localhost",27017).close();
        }catch(Exception e){
            System.out.println(e.getMessage());
                           } */
        DBCursor iterador = BD_Mongo.Conexion.collection.find();
        int cantidad = (int) BD_Mongo.Conexion.collection.getCount();
        try {
            //	while (cursor.hasNext()) {
            //		System.out.println(cursor.next().toString());
            //                          }
            for(int i=0 ; i<cantidad ; i++){
                System.out.println(iterador.next().toString());
                                            }
            } finally {
            iterador.close();
                        }

    }
}
