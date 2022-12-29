package com.cml;

import com.cml.model.PatternConfig;
import com.cml.patterns.ExecutablePattern;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class PatternConstructor {

    // Loads the PatternConfigration, returns the list of named ExecutablePatterns, then constructs instances of their
    // classes, returning them as a list
    public static List<ExecutablePattern> getPatternsToExecute() throws IOException {
        List<ExecutablePattern> patternsToExecute = new ArrayList<>();

        PatternConfig patternConfig = PatternConfigLoader.getPatternConfiguration();
        List<String> listedPatterns = patternConfig.getPatterns();

        for (String patternName: listedPatterns) {
            try {
                Class<?> cl = Class.forName(patternName);
                Constructor c = cl.getConstructor();
                patternsToExecute.add((ExecutablePattern) c.newInstance());
            } catch (ClassNotFoundException
                     | NoSuchMethodException
                     | InvocationTargetException
                     | InstantiationException
                     | IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return patternsToExecute;
    }






}
