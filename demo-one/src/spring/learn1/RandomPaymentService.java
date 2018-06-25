package spring.learn1;

import java.util.Random;

public class RandomPaymentService implements PaymentService{

    private Random rand = new Random();
    private String[] data = {
            "Pay Day!", "Week until your payment.", "You got paid week ago."
    };

    @Override
    public String getPayment() {
        return  data[rand.nextInt(data.length)];
    }

}
