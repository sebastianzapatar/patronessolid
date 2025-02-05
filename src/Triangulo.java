public class Triangulo implements Figura{
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float area() {
        return base*altura/2;
    }

    @Override
    public void presentacion() {
        System.out.println("Soy un triangulo" +
                " peque y triste" +
                "mi area es "+area());
    }
}
