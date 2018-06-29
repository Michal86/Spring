package spring.learn2;

import org.springframework.stereotype.Component;

@Component  // annotation so Spring can auto-scan and find this implementation for Spring container
public class MyHelperService implements HelperService{

    @Override
    public String getHelp() {
        return "Help is coming!";
    }

}
