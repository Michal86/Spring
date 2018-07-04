package spring.learn2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileHelperService implements HelperService {

    private static final String FILENAME = "./src/helper-data.txt";
    private List<String> data;
    private Random myRandom = new Random();

    public FileHelperService(){
        System.out.println(">> FileHelperService: inside of Constructor");
        data = new ArrayList<>();
    }

    // define init method
    @PostConstruct
    private void loadDataInitMethod(){
        System.out.println(">> FileHelperService: inside of init method()");
        try{
            File file = new File(FILENAME);

            BufferedReader br = new BufferedReader(new FileReader(file));
            String sLine;

            while ((sLine = br.readLine())!= null){
                data.add(sLine);
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(data.size());
    }

    // define my destroy method
    @PreDestroy
    private void clearDataDestroyMethod(){
        System.out.println(">> FileHelperService: inside destroy method");
        data.clear();
    }

    @Override
    public String getHelp() {
        int index = myRandom.nextInt(data.size());

        return data.get(index);
    }
}
