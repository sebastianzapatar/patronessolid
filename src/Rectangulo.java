public class Rectangulo implements Figura{
    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public float area(){
        return this.base*this.altura;
    }

    @Override
    public void presentacion() {
        System.out.println("Soy el megarectangulo" +
                " y mi area es "+ area());
    }
}
