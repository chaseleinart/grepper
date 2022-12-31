package com.cml.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ABeforeBPattern implements ExecutablePattern {
    @Override
    public List<String> processInput(BufferedReader br) throws IOException {
        List<String> matches = new ArrayList<>();
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            // check if r comes before gh and both are present
            if ((line.lastIndexOf("a") != -1 && line.lastIndexOf("b") != -1 && line.indexOf("a") < line.lastIndexOf("b"))
                    // make sure dash is not between the r and gh
                    && !(line.indexOf("a") < line.lastIndexOf("-") && line.lastIndexOf("-") < line.lastIndexOf("b"))) {
                matches.add(line);
                System.out.println(line);
            }
        }
        System.out.println(matches.size() +" matches: " + matches);
        return matches;
    }
}
