public class Pizza {
    private int cantidadPorciones;

    @Override
    public String toString() {
        return "Pizza{" +
                "cantidadPorciones=" + cantidadPorciones +
                '}';
    }

    public Pizza(int cantidadPorciones) {
        this.cantidadPorciones = cantidadPorciones;
    }

    public int getCantidadPorciones() {
        return cantidadPorciones;
    }

    public void setCantidadPorciones(int cantidadPorciones) {
        this.cantidadPorciones = cantidadPorciones;
    }
}
