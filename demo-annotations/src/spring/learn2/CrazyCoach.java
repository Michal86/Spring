package spring.learn2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CrazyCoach implements Coach{

    @Autowired  // Field Injection - directly to the field, even if it's private, no need setter method
    private HelperService helperService;

    public CrazyCoach(){
        System.out.println(">> CrazyCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Do some crazy stuff.";
    }

    @Override
    public String getServiceHelp() {
        return helperService.getHelp();
    }
}
