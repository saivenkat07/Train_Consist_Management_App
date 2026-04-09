package Main;

import java.util.LinkedList;

public class Train_Consist_Management_System {

    public static void main(String[] args) {

        System.out.println("=== UC4 - Maintain Ordered Bogie Consist ===");
        System.out.println();

        // Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // Add initial bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);
        System.out.println();

        // Insert Pantry Car at position 2
        train.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(train);
        System.out.println();

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(train);
        System.out.println();

        System.out.println("UC4 ordered consist operations completed...");
    }
}