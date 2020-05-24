package ocp;

public class GoldDiscount implements Discount{

    // 3. Diseña un descuento para clientes Gold
    public Double apply(Double price){

        return price * 0.2;
    }
}
