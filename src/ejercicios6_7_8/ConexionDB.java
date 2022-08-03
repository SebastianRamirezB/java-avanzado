package ejercicios6_7_8;

public class ConexionDB {

    private static ConexionDB conexionDB;

    private ConexionDB() {}


    public static ConexionDB getInstance() {
        if(conexionDB == null) {
            conexionDB = new ConexionDB();
        }

        return conexionDB;
    }



}
