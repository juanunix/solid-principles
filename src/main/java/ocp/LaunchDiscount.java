package ocp;

public class LaunchDiscount implements Discount {

    // 1. Diseñar un descuento para lanzar nuestra app.
    public Double apply(Double price){

        return price * 0.5;
    }
}
