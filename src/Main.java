import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConexionDB conexionDB=
                ConexionDB.obtenerConexion();
        ConexionDB conexion2=
                ConexionDB.obtenerConexion();
        System.out.println(conexionDB.hashCode());
        System.out.println(conexion2.hashCode());
    }
}