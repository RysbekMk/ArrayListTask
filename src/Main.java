import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> randomSandar = new ArrayList<>();
        ArrayList<Integer> jupSandar = new ArrayList<>();
        ArrayList<Integer> takSandar = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            randomSandar.add(random.nextInt(1,100));
            if (randomSandar.get(i)%2==0){
                jupSandar.add(randomSandar.get(i));
            }else {
                takSandar.add(randomSandar.get(i));
            }
        }
        System.out.println(randomSandar);
        System.out.println(jupSandar);
        System.out.println(takSandar);


    }
}