public class ConexionDB {
    private static ConexionDB conexion;
    private ConexionDB(){
        System.out.println("Se crea el objeto");
    }
    public static ConexionDB obtenerConexion(){
        if(conexion==null)
        {
            conexion=new ConexionDB();
        }
        return conexion;
    }
}
