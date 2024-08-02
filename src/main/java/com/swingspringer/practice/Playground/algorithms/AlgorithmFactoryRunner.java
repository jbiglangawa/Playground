package com.swingspringer.practice.Playground.algorithms;

import com.swingspringer.practice.Playground.algorithms.binarysearch.LinearSearch;

public class AlgorithmFactoryRunner {
    public Algorithm[] algorithms = {
            new LinearSearch()
    };

    public void run() {
        for(Algorithm algorithm : algorithms) {
            long start = System.currentTimeMillis();
            algorithm.execute();
            long end = System.currentTimeMillis();
            System.out.format("%s took %d", getClassName(algorithm), getTotalTimeElapsedMs(start, end));
        }
    }

    private String getClassName(Algorithm algorithm) {
        var algorithmClass = algorithm.getClass();
        String[] packageName = algorithmClass.getPackageName().split("\\.");
        return String.format("%s.%s", packageName[packageName.length - 1], algorithmClass.getCanonicalName());
    }

    private long getTotalTimeElapsedMs(long startTime, long endTime) {
        return endTime - startTime;
    }

}
