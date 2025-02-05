/*
Patrón simple factory
 */
public class Pizzeria {
    public Pizza pizzaPeque(){
        return new Pizza(4);
    }
    public Pizza pizzaMediana(){
        return new Pizza(8);
    }
    public Pizza pizzaGrande(){
        return new Pizza(12);
    }
}
