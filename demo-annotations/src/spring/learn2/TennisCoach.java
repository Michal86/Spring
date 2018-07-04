package spring.learn2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*
As of Spring Framework 4.3, an @Autowired annotation on such a constructor is no longer necessary
if the target bean only defines one constructor to begin with.
However, if several constructors are available, at least one must be annotated to teach the container which one to use.
 */

@Component // using default bean id -> "tennisCoach"
public class TennisCoach implements Coach{

    private HelperService helperService;

    @Autowired  // Injection - Spring will find a bean that implements HelperService
    public TennisCoach(@Qualifier("randomService") HelperService helperService){
        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
        this.helperService = helperService;
    }

    // define my init method
    @PostConstruct
    public void doMyInitStuff(){
        System.out.println(">> TennisCoach: inside of init method()");
    }

    // define my destroy method
    @PreDestroy
    public void doMyDestroyStuff(){
        System.out.println(">> TennisCoach: inside destroy method");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice groundstroke and volley practice drills";
    }

    @Override
    public String getServiceHelp() {
        return helperService.getHelp();
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getTeam() {
        return null;
    }

    @Override
    public String getBatch() {
        return null;
    }
}
