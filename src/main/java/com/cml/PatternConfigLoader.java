package com.cml;

import com.cml.model.PatternConfig;


import java.io.*;
import java.nio.charset.StandardCharsets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.io.input.ReaderInputStream;

public class PatternConfigLoader {

    private static final String CONFIG = "/src/main/resources/config.yaml";

    // Returns a PatternConfig via a provided config file name
    public static PatternConfig getPatternConfiguration() throws IOException {
        String file = new File("").getAbsolutePath().concat(CONFIG);

        try(BufferedReader br = new BufferedReader(new FileReader(file));
            InputStream inputStream = new ReaderInputStream(br, StandardCharsets.UTF_8)){

            return PatternConfigLoader.loadPatternConfiguration(inputStream);
        }

    }

    // Provided an InputStream of a named config file, maps the yaml to a PatternConfig.
    private static PatternConfig loadPatternConfiguration(final InputStream scopingFile) {
        PatternConfig patternConfig;
        try {
            patternConfig = new ObjectMapper(new YAMLFactory()).readValue(scopingFile, PatternConfig.class);
            scopingFile.close();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

        return patternConfig;
    }
}
