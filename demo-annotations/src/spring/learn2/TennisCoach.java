package spring.learn2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
As of Spring Framework 4.3, an @Autowired annotation on such a constructor is no longer necessary
if the target bean only defines one constructor to begin with.
However, if several constructors are available, at least one must be annotated to teach the container which one to use.
 */

@Component // using default bean id -> "tennisCoach"
public class TennisCoach implements Coach{

    private HelperService helperService;

    @Autowired  // Injection - Spring will find a bean that implements HelperService
    public TennisCoach(HelperService helperService){
        this.helperService = helperService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice groundstroke and volley practice drills";
    }

    @Override
    public String getServiceHelp() {
        return helperService.getHelp();
    }
}
