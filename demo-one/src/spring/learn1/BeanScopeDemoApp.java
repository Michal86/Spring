package spring.learn1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
        // load the spring config. file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        Coach betaCoach = context.getBean("myCoach", Coach.class);

        // check if they're the same / default is Singleton

        boolean result = (theCoach == alphaCoach);

        System.out.println("Pointing to the same object: "+ result);
        System.out.println("Memory locations for theCoach: "+ theCoach);
        System.out.println("Memory locations for alphaCoach: "+ alphaCoach);

        if (theCoach == betaCoach) System.out.println("Used Singleton (default) scope");
        else
            System.out.println("Used different scope than Singleton");

        // close the context
        context.close();
    }
}
