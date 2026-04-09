package Main;

import java.util.HashSet;
import java.util.Set;

public class Train_Consist_Management_APP {

    public static void main(String[] args) {

        System.out.println("=== UC3 - Unique Bogie ID Tracking ===");
        System.out.println();

        // Create HashSet
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Bogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);
        System.out.println();

        System.out.println("Total Unique Bogies : " + bogieIds.size());
        System.out.println();

        System.out.println("UC3 operations completed successfully...");
    }
}