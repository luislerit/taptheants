package ph.edu.dlsu.tapspider;

/**
 * Created by luis on 11/15/2015.
 */
import java.util.Random;

public class Spiders {

    int spiderCounter = 0;

    public void createSpider(){
        Random generator = new Random();
        int spawn = generator.nextInt(99);

        if (spawn<79){
            //will spawn small spiders
            spiderCounter++;
        }
        else{
            //will spawn broodmomma
            spiderCounter=spiderCounter+2;
        }

    }


}
