import java.util.LinkedHashSet;

public class Train_Consist_Management_System {

    public static void main(String[] args) {

        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("========================================");

        // Create LinkedHashSet
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Adding duplicate
        trainFormation.add("Sleeper"); // ignored

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);
        System.out.println();

        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println();

        System.out.println("UC5 formation setup completed...");
    }
}
