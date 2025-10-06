package org.main;

import java.util.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    @Test
    void testBruteForce(){
        Main main = new Main();
        int arr[] = {3, 5, -4, 8, 11, 1, -1, 6};
        int res[] = main.bruteForce(arr,10);
        Map<Integer, Integer> actualFreq = new HashMap<>();
        for (int i : res) {
            actualFreq.put(i, actualFreq.getOrDefault(i, 0) + 1);
        }
        Map<Integer,Integer> expectedFreq = new HashMap<>();
        expectedFreq.put(11,1);
        expectedFreq.put(-1,1);
        assertEquals(actualFreq,expectedFreq);
    }

    @Test
    void testTwoPointer(){
        Main main = new Main();
        int arr[] = {1,2,3};
        int res[] = main.twoPointer(arr,3);
        Map<Integer, Integer> actualFreq = new HashMap<>();
        for (int i : res) {
            actualFreq.put(i, actualFreq.getOrDefault(i, 0) + 1);
        }
        Map<Integer,Integer> expectedFreq = new HashMap<>();
        expectedFreq.put(1,1);
        expectedFreq.put(2,1);
        assertEquals(actualFreq,expectedFreq);
    }

    @Test
    void testUsingMap(){
        Main main = new Main();
        int arr[] = {2,2,3,3};
        int res[] = main.usingMap(arr,5);
        Map<Integer, Integer> actualFreq = new HashMap<>();
        for (int i : res) {
            actualFreq.put(i, actualFreq.getOrDefault(i, 0) + 1);
        }
        Map<Integer,Integer> expectedFreq = new HashMap<>();
        expectedFreq.put(2,1);
        expectedFreq.put(3,1);
        assertEquals(actualFreq,expectedFreq);
    }

    @Test
    void testBruteForce_noPairsFound(){
        Main main = new Main();
        int arr[] = {3, 5, -4, 8};
        int res[] = main.bruteForce(arr,10);
        Map<Integer, Integer> actualFreq = new HashMap<>();
        for (int i : res) {
            actualFreq.put(i, actualFreq.getOrDefault(i, 0) + 1);
        }
        Map<Integer,Integer> expectedFreq = new HashMap<>();
        expectedFreq.put(0,2);
        assertEquals(actualFreq,expectedFreq);
    }

    @Test
    void testTwoPointer_noPairsFound(){
        Main main = new Main();
        int arr[] = {3, 5, -4, 8, 11, 1};
        int res[] = main.twoPointer(arr,10);
        Map<Integer, Integer> actualFreq = new HashMap<>();
        for (int i : res) {
            actualFreq.put(i, actualFreq.getOrDefault(i, 0) + 1);
        }
        Map<Integer,Integer> expectedFreq = new HashMap<>();
        expectedFreq.put(0,2);
        assertEquals(actualFreq,expectedFreq);
    }

    @Test
    void testUsingMap_noPairsFound(){
        Main main = new Main();
        int arr[] = {1, -1, 6};
        int res[] = main.usingMap(arr,10);
        Map<Integer, Integer> actualFreq = new HashMap<>();
        for (int i : res) {
            actualFreq.put(i, actualFreq.getOrDefault(i, 0) + 1);
        }
        Map<Integer,Integer> expectedFreq = new HashMap<>();
        expectedFreq.put(0,2);
        assertEquals(actualFreq,expectedFreq);
    }

}
