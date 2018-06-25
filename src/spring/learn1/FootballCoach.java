package spring.learn1;

public class FootballCoach implements Coach{

    private PaymentService paymentService;

    public FootballCoach(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public String getDailyWorkout() {
        return "Standard drill plus free kick competition";
    }

    @Override
    public double getMonthlySalary() {
        return 12900.00;
    }

    @Override
    public String getPaymentInfo() {
        return "Pay day! -> "+ paymentService.getPayment();
    }
}
