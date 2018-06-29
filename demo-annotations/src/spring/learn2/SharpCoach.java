package spring.learn2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SharpCoach implements Coach{

    private HelperService helperService;

    @Value("${foo.batch}")
    private String batch;

    public SharpCoach(){
        System.out.println(">> SharpCoach: inside default constructor");
    }

    // define a setter method
    @Autowired  // Setter Injection
    @Qualifier("myHelperService")
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

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getTeam() {
        return null;
    }

    public String getBatch() {
        return "Batch: "+batch;
    }
}
