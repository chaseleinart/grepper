package com.cml;

import com.cml.patterns.ExecutablePattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // Get the text file to process patterns against. For now, just using a single file
        String file = new File("").getAbsolutePath().concat("/src/main/resources/words.txt");
        // Load file contents into a BufferedReader
        BufferedReader br = new BufferedReader(new FileReader(file));
        // Create a list of ExecutablePatterns specified in the config file
        List<ExecutablePattern> patternList = PatternConstructor.getPatternsToExecute();
        // Iterate through the list of ExecutablePatterns, calling each one's processInput() method
        PatternExecutor.executePatterns(patternList, br);
    }
}
