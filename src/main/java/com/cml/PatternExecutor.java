package com.cml;

import com.cml.patterns.ExecutablePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class PatternExecutor {

    // Takes a list of ExecutablePatterns representing the contents of the config file, and executes the
    // configured patterns against the file.
    public static void executePatterns(List<ExecutablePattern> executablePatterns) throws IOException {
        for (ExecutablePattern pattern : executablePatterns) {
            BufferedReader br = BufferedReaderLoader.getNewBufferedReader();
            pattern.processInput(br);
        }
    }
}
