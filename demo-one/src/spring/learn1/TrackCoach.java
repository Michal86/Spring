package spring.learn1;

public class TrackCoach implements Coach {

    private PaymentService paymentService;

    public TrackCoach(){}

    public TrackCoach(PaymentService thePaymentService){
        paymentService = thePaymentService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public double getMonthlySalary() {
        return 7900.00;
    }

    @Override
    public String getPaymentInfo() {
        return "Pay day! -> "+ paymentService.getPayment();
    }

    // add an init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyDestroyMethod(){
        System.out.println("TrackCoach: inside method doMyDestroyMethod");
    }
}
