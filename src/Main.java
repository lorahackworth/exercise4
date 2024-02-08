import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, ArrayList<Double>> myCityTempMap = new HashMap<>();

        Scanner input = new Scanner(System.in);

        //starts the loop off
        System.out.println("Enter a city of your choice (OR TYPE END TO END): ");
        String userChoice = input.nextLine();

        // stores the user's city choice and doesn't end until user types "END"
        while(!(userChoice.equals("END"))){
            myCityTempMap.put(userChoice, new ArrayList<Double>(0));
            System.out.println("Enter a city of your choice (OR TYPE END TO END): ");
            userChoice = input.nextLine();
        }
        System.out.println(myCityTempMap);



        // main loop for temperature
        for (Map.Entry<String,ArrayList<Double>> entry : myCityTempMap.entrySet()) {
            // gets string key (the city name) from the list and prints it out so user knows
            // what city they're printing temperature out for
            String key = entry.getKey();
            System.out.println("Please print out the temperature for: " + key);

            //uses temperature method to calculate
            Double sum = temperature(myCityTempMap);

            System.out.println("Average temperature for " + key + " was " + sum);

        }

        System.out.println(myCityTempMap);

    }

    static Double temperature(Map<String,ArrayList<Double>> a){
        Scanner input = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            int dayNum = i+1;
            System.out.println("Enter the temperature for day " + dayNum + ": ");
            sum += input.nextDouble();
            input.nextLine();
        }
        sum = sum/5;

        return sum;
    }

}


