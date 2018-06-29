package spring.learn2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SharpCoach implements Coach{

    private HelperService helperService;

    public SharpCoach(){
        System.out.println(">> SharpCoach: inside default constructor");
    }

    // define a setter method
    @Autowired  // Setter Injection
    public void setHelperService(HelperService helperService) {
        System.out.println(">> SharpCoach: inside setHelperService() method");
        this.helperService = helperService;
    }

    @Override
    public String getDailyWorkout() {
        return "Write some c# code";
    }

    @Override
    public String getServiceHelp() {
        return helperService.getHelp();
    }
}
