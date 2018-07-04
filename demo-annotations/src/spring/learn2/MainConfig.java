package spring.learn2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:coach.properties")
//@ComponentScan("spring.learn2")
public class MainConfig {

    // define bean for odd helper service
    @Bean
    public HelperService oddHelperService(){
        return new OddHelperService();
    }

    // define bean for swim coach and inject dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(oddHelperService());
    }

}
