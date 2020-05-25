package isp;

// 1. Diseñar una interface de Payment para gestionar pagos.
public interface Payment {

    void calculatePayment();
    void creditCardPayment();
    void bankTransferPayment();
    void cashPayment();
}
