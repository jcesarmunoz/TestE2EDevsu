package starter.utils;

import java.util.Random;

public class RandomOperations {

    public static int ultimateNumber;

    /**
     * This method returns a random number between 0 and the specified maximum value. The 'ultimateNumber' parameter facilitates the generation of a unique random number by ensuring that previous numbers are not repeated
     * @param max maximun value
     * @return number random
     */

    public static int numberRandominRange(int max){
        Random random=new Random();
        int numberRandom=random.nextInt(max);
        while(numberRandom == ultimateNumber){
            numberRandom=random.nextInt(max);
        }
        ultimateNumber=numberRandom;
        return numberRandom;
    }
}
