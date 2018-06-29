package spring.learn2;

import org.springframework.stereotype.Component;

@Component // using default bean id -> "tennisCoach"
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice groundstroke and volley practice drills";
    }

}
