package spring.learn2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

    public static void main(String[] args){

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach myCoach = context.getBean("tennisCoach", Coach.class);
        Coach sharpCoach = context.getBean("sharpCoach", Coach.class);

        //call a method on the bean
        System.out.println("=== Tennis Coach ===");
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getServiceHelp());

        System.out.println("=== C# Coach ===");
        System.out.println(sharpCoach.getDailyWorkout());
        System.out.println(sharpCoach.getServiceHelp());

        // close the context
        context.close();
    }
}
