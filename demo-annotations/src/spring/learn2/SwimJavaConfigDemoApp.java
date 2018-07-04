package spring.learn2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args){

        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        //--- Get the bean from spring container ---
        Coach myCoach = context.getBean("swimCoach", Coach.class);

        //call a methods on the bean
        System.out.println("=== Swim Coach ===");
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getServiceHelp());
        System.out.println(myCoach.getTeam());


        // close the context
        context.close();
    }
}
