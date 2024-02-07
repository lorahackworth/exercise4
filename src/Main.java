import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, ArrayList<Double>> myCityTempMap = new HashMap<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a city of your choice (OR TYPE END TO END): ");
        String userChoice = input.nextLine();

        while(!(userChoice.equals("END"))){
            myCityTempMap.put(userChoice, new ArrayList<Double>(0));
            System.out.println("Enter a city of your choice (OR TYPE END TO END): ");
            userChoice = input.nextLine();
        }
        System.out.println(myCityTempMap);

        for (int i = 0; i < myCityTempMap.size(); i++) {
            temperature(myCityTempMap);

        }

    }

    static void temperature(Map<String,ArrayList<Double>> a){

        for (int i = 0; i < 5; i++) {

        }

    }

}


