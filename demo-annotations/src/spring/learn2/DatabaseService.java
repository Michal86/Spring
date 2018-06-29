package spring.learn2;

import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements HelperService{

    @Override
    public String getHelp() {
        return "Crazy fast database service";
    }
}
