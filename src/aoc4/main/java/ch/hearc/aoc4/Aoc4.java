package ch.hearc.aoc4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Aoc4 {
    public static void main(String[] args) {
        String filePath = "src/aoc3/main/resources/Day4Input.txt";
        List<String> input = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                input.add(line);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier: " + e.getMessage());
        }

        int result1 = findFullyContainedPairs(input);
        System.out.println("Le nombre de paires avec une plage complètement contenue dans l'autre est: " + result1);

        int result2 = findOverlappingPairs(input);
        System.out.println("Le nombre de paires avec des plages qui se chevauchent est: " + result2);
    }

    public static int findFullyContainedPairs(List<String> input) {
        int count = 0;
        for (String pair : input) {
            String[] ranges = pair.split(",");
            String[] range1 = ranges[0].split("-");
            String[] range2 = ranges[1].split("-");

            int start1 = Integer.parseInt(range1[0]);
            int end1 = Integer.parseInt(range1[1]);
            int start2 = Integer.parseInt(range2[0]);
            int end2 = Integer.parseInt(range2[1]);

            if ((start1 >= start2 && end1 <= end2) || (start2 >= start1 && end2 <= end1)) {
                count++;
            }
        }
        return count;
    }

    public static int findOverlappingPairs(List<String> input) {
        int count = 0;
        for (String pair : input) {
            String[] ranges = pair.split(",");
            String[] range1 = ranges[0].split("-");
            String[] range2 = ranges[1].split("-");

            int start1 = Integer.parseInt(range1[0]);
            int end1 = Integer.parseInt(range1[1]);
            int start2 = Integer.parseInt(range2[0]);
            int end2 = Integer.parseInt(range2[1]);

            if ((start1 <= end2 && end1 >= start2) || (start2 <= end1 && end2 >= start1)) {
                count++;
            }
        }
        return count;
    }
}
