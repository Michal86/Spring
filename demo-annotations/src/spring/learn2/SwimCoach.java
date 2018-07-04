package spring.learn2;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements  Coach{

    private HelperService helperService;

    @Value("${foo.email}")
    private String email;

    @Value("${swim.team}")
    private String team;

    public SwimCoach(HelperService helperService){
        this.helperService = helperService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 500m as a warm up.";
    }

    @Override
    public String getServiceHelp() {
        return helperService.getHelp();
    }

    @Override
    public String getEmail() {
        return "E-mail: "+email;
    }

    @Override
    public String getTeam() {
        return "Team: "+ team;
    }

    @Override
    public String getBatch() {
        return "No batch yet.";
    }
}
