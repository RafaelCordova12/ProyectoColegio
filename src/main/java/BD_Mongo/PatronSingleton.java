package BD_Mongo;

import com.mongodb.Mongo;

public class PatronSingleton extends Mongo{

    private static PatronSingleton instance = null;

    protected PatronSingleton() throws UnsupportedOperationException{ }

    protected PatronSingleton(String ip, int port)  throws UnsupportedOperationException{
        super(ip, port);                                                           }

    public static synchronized PatronSingleton getInstance(String ip, int port) {
        if (instance == null){
            instance =  new PatronSingleton(ip,port);
                             }
        return instance;
                                                             }
}