package Modelos;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import org.bson.types.ObjectId;

import java.util.*;

public class Profesor extends Persona {

    private String cod_profe;
    private ArrayList<String> materias ;

    public Profesor() { }

    public Profesor(String dni, String nombre, String apellido, String cod_profe, ArrayList<String> materias) {
        super(dni, nombre, apellido);
        this.cod_profe = cod_profe;
        this.materias = materias;
    }

    public Profesor(String cod_profe, ArrayList<String> materias) {
        this.cod_profe = cod_profe;
        this.materias = materias;
    }

    public String getCod_profe() {
        return cod_profe;
    }

    public void setCod_profe(String cod_profe) {
        this.cod_profe = cod_profe;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }

    public Profesor(BasicDBObject colecProfesor){
        this.dni = colecProfesor.getString("dni");
        this.nombre = colecProfesor.getString("nombre");
        this.apellido = colecProfesor.getString("apellido");
        this.cod_profe = colecProfesor.getString("code_profe");

        BasicDBList listMaterias = (BasicDBList) colecProfesor.get("materias");
        this.materias = new ArrayList<>();

        for(Object mater : listMaterias){
            this.materias.add(mater.toString());
                                       }
                                                 }

    public BasicDBObject toDBObjectProfesor(){

        BasicDBObject dbObjectProfesor = new BasicDBObject();

        String id_aux = new ObjectId().toString();

        dbObjectProfesor.append("_id",id_aux);
        dbObjectProfesor.append("nombre",this.getNombre());
        dbObjectProfesor.append("apellido",this.getApellido());
        dbObjectProfesor.append("code_profe",this.getCod_profe());
        dbObjectProfesor.append("materias",this.getMaterias());
        return dbObjectProfesor;
                                            }

    @Override
    public String toString() {
        return "Profesor{" + "cod_profe='" + cod_profe + '\'' + ", materias=" + materias + '}';
                             }

}
