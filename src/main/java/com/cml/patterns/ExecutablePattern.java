package com.cml.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public interface ExecutablePattern {
    List<String> processInput(BufferedReader br) throws IOException;
}
