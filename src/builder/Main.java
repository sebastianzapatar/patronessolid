package builder;

public class Main {
    public static void main(String[] args) {
        Estudiante e1=Estudiante.make()
                .setNombre("Carepinga")
                .setApellido("Pardo")
                .setDireccion("xxx")
                .Build();
    }
}
