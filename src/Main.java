import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> myCityTempMap = new HashMap<>();

        Scanner input = new Scanner(System.in);

        //starts the loop off
        System.out.println("Enter a city of your choice (OR TYPE END TO END): ");
        String userChoice = input.nextLine();

        // stores the user's city choice and doesn't end until user types "END"
        while(!(userChoice.equals("END"))){
            myCityTempMap.put(userChoice, 0.0);
            System.out.println("Enter a city of your choice (OR TYPE END TO END): ");
            userChoice = input.nextLine();
        }

        // main loop for temperature
        for (Map.Entry<String,Double> entry : myCityTempMap.entrySet()) {
            // gets string key (the city name) from the list and prints it out so user knows
            // what city they're printing temperature out for
            String key = entry.getKey();
            System.out.println("\nPlease print out the temperature for: " + key);

            //uses temperature method to calculate
            Double sum = temperature(myCityTempMap);

            System.out.println("\nAverage temperature for " + key + " was " + sum);

            myCityTempMap.put(key, sum);
        }

        //display method
        display(myCityTempMap);

    }

    //calculates the average temperature for each city
    static Double temperature(Map<String,Double> a){
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

    //displays the final average temps and cities
    static void display(Map<String, Double> a){
        System.out.println("\nThe averages for the cities you chose are as follows...");
        System.out.println(a);
        System.out.println("\n--> See you again soon! <--");
    }

}

