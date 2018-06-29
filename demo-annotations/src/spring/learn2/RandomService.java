package spring.learn2;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class RandomService implements HelperService{

    private String[] data= {"Giving a bottle of water", "Correcting mistakes", "Gathering balls"};
    private Random rand = new Random();

    @Override
    public String getHelp() {
        String myData = data[rand.nextInt(data.length)];
        return myData;
    }
}
