package main;
import java.util.ArrayList;
import java.util.List;


public class UseCase1TrainConsist {

    public static void main(String[] args) {
        // Display welcome banner
        System.out.println("\n=== Train Consist Management App ===\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);
        System.out.println("\nSystem ready for operations...");
    }
}
