package com.xworkz.FunctionalInterfaces.runner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeMinister {
    public static void main(String[] args) {
        // Collection of Long values
        List<Long> longList = Arrays.asList(100L, 5L, 25L, 50L, 75L, 30L, 45L, 10L, 20L, 15L);

        // a. Sort in ascending order
        List<Long> ascendingLongList = longList.stream()
                                               .sorted()
                                               .collect(Collectors.toList());
        System.out.println("Long list sorted in ascending order: " + ascendingLongList);

        // b. Sort in descending order
        List<Long> descendingLongList = longList.stream()
                                                .sorted(Collections.reverseOrder())
                                                .collect(Collectors.toList());
        System.out.println("Long list sorted in descending order: " + descendingLongList);
    }
}
