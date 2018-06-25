package spring.learn1;

public class CricketCoach implements Coach{

    private PaymentService  paymentService;

    // add new fields for emailAddress and team
    private String          emailAddress;
    private String          team;

    public CricketCoach(){}

    // setter methods for dependency injection
    public void setPaymentService(PaymentService paymentService) {
        System.out.println("CricketCoach: inside setter method - setPaymentService");
        this.paymentService = paymentService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    // --- getters ---
    public String getEmailAddress() {
        return "Email address: "+ emailAddress;
    }

    public String getTeam() {
        return "Team: "+ team;
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket workout";
    }

    @Override
    public double getMonthlySalary() {
        return 5554;
    }

    @Override
    public String getPaymentInfo() {
        return "Pay day! -> "+ paymentService.getPayment();
    }
}
