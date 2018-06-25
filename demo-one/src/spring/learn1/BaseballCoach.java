package spring.learn1;

public class BaseballCoach implements Coach{

    // define a private field for dependency
    private PaymentService paymentService;

    //define constructor for dependency injection
    public BaseballCoach(PaymentService thePaymentService){
        paymentService = thePaymentService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public double getMonthlySalary() {
        return 9500.00;
    }

    @Override
    public String getPaymentInfo() {
        // use my paymentService to get paid
        return "Pay day! -> "+ paymentService.getPayment();
    }

}
