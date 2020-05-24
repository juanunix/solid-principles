package ocp;

public class DiscountManager {

    // 2. Diseñar manager de Descuentos para gestionar el descuento.
    Double apply(Double price, Discount discount) {

        return discount.apply(price);
    }

}
