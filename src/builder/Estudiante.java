package builder;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;

    public static Estudiante make(){
        return new Estudiante();
    }
    public String getNombre() {
        return nombre;
    }

    public Estudiante setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellido() {
        return apellido;
    }
    public Estudiante Build(){
        return this;
    }
    public Estudiante setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Estudiante setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Estudiante setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Estudiante setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }
}
