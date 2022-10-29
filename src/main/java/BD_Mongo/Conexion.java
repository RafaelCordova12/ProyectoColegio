package BD_Mongo;

import com.mongodb.DB;
import com.mongodb.DBCollection;


public class Conexion extends PatronSingleton {

    static public PatronSingleton mongoClient = getInstance("localhost",27017);
    static public DB db = mongoClient.getDB("Colegio");
    static public DBCollection collection = db.getCollection("Profesores");

                                            }
