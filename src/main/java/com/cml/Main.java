package com.cml;

import com.cml.patterns.ExecutablePattern;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // Create a list of ExecutablePatterns specified in the config file
        List<ExecutablePattern> patternList = PatternConstructor.getPatternsToExecute();
        // Iterate through the list of ExecutablePatterns, calling each one's processInput() method
        PatternExecutor.executePatterns(patternList);
    }
}
