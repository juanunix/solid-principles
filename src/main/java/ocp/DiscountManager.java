package ocp;

public class DiscountManager {

    // 2. Diseñar manager de Descuentos para gestionar el descuento.
    Double apply(Double price, Discount discount) {

        return discount.apply(price);
    }

    // 3. Diseña un descuento para clientes Gold
    Double apply(Double price, GoldDiscount discount) {

        return discount.apply(price);
    }

    // 4. Diseña un descuento para BlackFriday
    Double apply(Double price, BlackFridayDiscount discount) {

        return discount.apply(price);
    }
}
