package spring.learn1;

public class MyApp {

    public static void main(String[] args){

        //create the object
        Coach theCoach = new TrackCoach(new HappyPaymentService());

        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }

}
