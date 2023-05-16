package ch.hearc.aoc3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Aoc3Test {

    @Test
    void findPriorityOfSharedItemTypeTest() {
        assertEquals(16, Aoc3.findPriorityOfSharedItemType("vJrwpWtwJgWrhcsFMMfFFhFp"));
        assertEquals(38, Aoc3.findPriorityOfSharedItemType("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"));
        assertEquals(42, Aoc3.findPriorityOfSharedItemType("PmmdzqPrVvPwwTWBwg"));
        assertEquals(22, Aoc3.findPriorityOfSharedItemType("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn"));
        assertEquals(20, Aoc3.findPriorityOfSharedItemType("ttgJtRGJQctTZtZT"));
        assertEquals(19, Aoc3.findPriorityOfSharedItemType("CrZsJsPPZsGzwwsLwLmpwMDw"));
    }

    @Test
    void getItemPriorityTest() {
        assertEquals(1, Aoc3.getItemPriority('a'));
        assertEquals(26, Aoc3.getItemPriority('z'));
        assertEquals(27, Aoc3.getItemPriority('A'));
        assertEquals(52, Aoc3.getItemPriority('Z'));
    }
}
