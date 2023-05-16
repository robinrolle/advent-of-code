package ch.hearc.aoc4;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aoc4Test {

    @Test
    public void testFindFullyContainedPairs() {
        List<String> input1 = Arrays.asList("2-4,6-8", "2-3,4-5", "5-7,7-9", "2-8,3-7", "6-6,4-6", "2-6,4-8");
        int expected1 = 2;
        assertEquals(expected1, Aoc4.findFullyContainedPairs(input1));

        List<String> input2 = Arrays.asList("1-3,2-4", "4-6,3-5", "7-9,8-10");
        int expected2 = 0;
        assertEquals(expected2, Aoc4.findFullyContainedPairs(input2));

        List<String> input3 = Arrays.asList("1-5,2-4", "6-10,7-9", "11-15,12-14");
        int expected3 = 3;
        assertEquals(expected3, Aoc4.findFullyContainedPairs(input3));
    }

    @Test
    public void testFindOverlappingPairs() {
        List<String> input1 = Arrays.asList("2-4,6-8", "2-3,4-5", "5-7,7-9", "2-8,3-7", "6-6,4-6", "2-6,4-8");
        int expected1 = 4;
        assertEquals(expected1, Aoc4.findOverlappingPairs(input1));

        List<String> input2 = Arrays.asList("1-3,2-4", "4-6,3-5", "7-9,8-10");
        int expected2 = 3;
        assertEquals(expected2, Aoc4.findOverlappingPairs(input2));

        List<String> input3 = Arrays.asList("1-5,2-4", "6-10,7-9", "11-15,12-14");
        int expected3 = 3;
        assertEquals(expected3, Aoc4.findOverlappingPairs(input3));
    }

}
