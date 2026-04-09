package Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class Train_Consist_Management_APP {

    public static void main(String[] args) {

        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("==========================================");
        System.out.println();

        // Create List
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Before sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println();

        // Sorting using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // After sorting
        System.out.println("After Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println();
        System.out.println("UC7 sorting completed...");
    }
}