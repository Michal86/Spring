package spring.learn1;

public class HappyPaymentService implements PaymentService{

    @Override
    public String getPayment() {
        return "Your payment transaction completed.";
    }
}
