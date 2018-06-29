package spring.learn2;

import org.springframework.stereotype.Component;
/*
 * RESTHelperService --> RESTHelperService
 * No conversion since the first two characters are upper case.
 * Behind the scenes, Spring uses the Java Beans Introspector to generate the default bean name.
 */
@Component
public class RESTHelperService implements HelperService {

    @Override
    public String getHelp() {
        return "REST service";
    }
}
