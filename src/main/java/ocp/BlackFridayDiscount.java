package ocp;

public class BlackFridayDiscount implements Discount{

    // 4. Diseña un descuento para BlackFriday
    public Double apply(Double price) {

        return price * 0.4;
    }
}
