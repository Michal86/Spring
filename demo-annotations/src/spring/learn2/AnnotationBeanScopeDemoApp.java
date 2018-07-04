package spring.learn2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args){

        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach alphaCoach = context.getBean("sharpCoach", Coach.class);
        Coach betaCoach = context.getBean("sharpCoach", Coach.class);

        // check if they are the same
        boolean equal = (alphaCoach == betaCoach);
        System.out.println("\n ------------------------- ");
        System.out.println("\n Pointing to the same object: "+ equal);
        System.out.println("Memory location for alphaCoach: "+ alphaCoach);
        System.out.println("Memory location for betaCoach: "+ betaCoach);

        // check Tennis Coach
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println("\n ------------------------- ");
        System.out.println("Check file random service: "+theCoach.getServiceHelp());

        // close
        context.close();
    }
}
