package com.cml;

import com.cml.patterns.ExecutablePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class PatternExecutor {

    // Takes a list of ExecutablePatterns and a BufferedReader, representing the contents of a named file, and executes the
    // configured patterns against the file.
    public static void executePatterns(List<ExecutablePattern> executablePatterns, BufferedReader br) throws IOException {
        for (ExecutablePattern pattern : executablePatterns) {
            pattern.processInput(br);
        }
    }
}
