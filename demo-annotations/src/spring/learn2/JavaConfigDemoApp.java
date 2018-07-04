package spring.learn2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args){

        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        //--- Get the bean from spring container ---
        // Constructor Injection
        Coach myCoach = context.getBean("tennisCoach", Coach.class);
        // Setter Injection
        Coach sharpCoach = context.getBean("sharpCoach", Coach.class);
        // Field Injection
        Coach crazyCoach = context.getBean("crazyCoach", Coach.class);

        //call a methods on the bean
        System.out.println("=== Tennis Coach ===");
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getServiceHelp());

        System.out.println("=== C# Coach ===");
        System.out.println(sharpCoach.getDailyWorkout());
        System.out.println(sharpCoach.getServiceHelp());
        System.out.println(sharpCoach.getBatch());

        System.out.println("=== Crazy Coach ===");
        System.out.println(crazyCoach.getDailyWorkout());
        System.out.println(crazyCoach.getServiceHelp());
        System.out.println(crazyCoach.getEmail());
        System.out.println(crazyCoach.getTeam());

        // close the context
        context.close();
    }
}
