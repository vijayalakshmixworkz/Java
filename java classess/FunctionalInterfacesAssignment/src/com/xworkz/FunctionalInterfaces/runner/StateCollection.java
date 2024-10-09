package com.xworkz.FunctionalInterfaces.runner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StateCollection {
    public static void main(String[] args) {
        List<String> stateNames = Arrays.asList("Karnataka", "Maharashtra", "Tamil Nadu", "Kerala", 
                                                "Gujarat", "Rajasthan", "West Bengal", 
                                                "Uttar Pradesh", "Punjab", "Bihar");

        List<String> ascendingStateNames = stateNames.stream()
                                                     .sorted()
                                                     .collect(Collectors.toList());
        System.out.println("State names sorted in ascending order: " + ascendingStateNames);

        List<String> descendingStateNames = stateNames.stream()
                                                      .sorted(Collections.reverseOrder())
                                                      .collect(Collectors.toList());
        System.out.println("State names sorted in descending order: " + descendingStateNames);
    }
}
