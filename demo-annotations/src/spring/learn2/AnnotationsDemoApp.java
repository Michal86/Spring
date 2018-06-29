package spring.learn2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

    public static void main(String[] args){

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach myCoach = context.getBean("tennisCoach", Coach.class);

        //call a method on the bean
        System.out.println("=== Test component annotation ===");
        System.out.println(myCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
