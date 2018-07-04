package spring.learn2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CrazyCoach implements Coach{

    @Autowired  // Field Injection - directly to the field, even if it's private, no need setter method
    @Qualifier("fileHelperService")
    private HelperService helperService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    // Constructor
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

    public String getEmail() {
        return "Email: "+email;
    }

    public String getTeam() {
        return "Team: "+team;
    }

    @Override
    public String getBatch() {
        return null;
    }
}
