package Main;

import java.util.ArrayList;
import java.util.List;

public class Train_Consist_Management_System {

    public static void main(String[] args) {

        System.out.println("=== UC2 - Add Passenger Bogies to Train ===");
        System.out.println();

        // Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);
        System.out.println();

        // Removing a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);
        System.out.println();

        // Checking existence
        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));
        System.out.println();

        // Final state
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);
        System.out.println();

        System.out.println("UC2 operations completed successfully...");
    }
}