package ch.hearc.aoc3;

import java.nio.file.Files;
import java.util.List;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class Aoc3 {
    public static void main(String[] args) {
        List<String> rucksacks = new ArrayList<>();
        try {
            rucksacks = Files.readAllLines(Paths.get("src/aoc3/main/resources/input.txt"));
        } catch (IOException e) {
            System.err.println("Error reading input.txt: " + e.getMessage());
            System.exit(1);
        }

        int sumOfPriorities = 0;
        for (int i = 0; i < rucksacks.size(); i += 3) {
            sumOfPriorities += findPriorityOfCommonBadgeItem(rucksacks.subList(i, i + 3));
        }

        System.out.println("Sum of priorities: " + sumOfPriorities);
    }

    static int findPriorityOfCommonBadgeItem(List<String> group) {
        Set<Character> commonItems = new HashSet<>();
        for (char c : group.get(0).toCharArray()) {
            commonItems.add(c);
        }

        for (int i = 1; i < group.size(); i++) {
            Set<Character> currentRucksackItems = new HashSet<>();
            for (char c : group.get(i).toCharArray()) {
                currentRucksackItems.add(c);
            }
            commonItems.retainAll(currentRucksackItems);
        }

        char commonBadgeItem = commonItems.iterator().next();
        return getItemPriority(commonBadgeItem);
    }

    static int findPriorityOfSharedItemType(String rucksack) {
        int n = rucksack.length() / 2;
        Set<Character> firstCompartment = new HashSet<>();
        Set<Character> secondCompartment = new HashSet<>();

        for (int i = 0; i < n; i++) {
            firstCompartment.add(rucksack.charAt(i));
        }

        for (int i = n; i < rucksack.length(); i++) {
            secondCompartment.add(rucksack.charAt(i));
        }

        firstCompartment.retainAll(secondCompartment);

        char sharedItem = firstCompartment.iterator().next();
        return getItemPriority(sharedItem);
    }

    static int getItemPriority(char item) {
        if ('a' <= item && item <= 'z') {
            return item - 'a' + 1;
        } else if ('A' <= item && item <= 'Z') {
            return item - 'A' + 27;
        } else {
            throw new IllegalArgumentException("Invalid item type");
        }
    }
}
