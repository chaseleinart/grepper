package com.cml;

import java.io.*;

public class BufferedReaderLoader {

    private static final String DICTIONARY = "/src/main/resources/words.txt";


    // Returns a new instance of a BufferedReader containing the dictionary file
    public static BufferedReader getNewBufferedReader() throws FileNotFoundException {
        // Get the text file to process patterns against. For now, just using a single file
        String file = new File("").getAbsolutePath().concat(DICTIONARY);
        // Load file contents into a BufferedReader - there is almost certainly a more efficient way to do this, but
        // the BufferedReader object can't be reused across ExecutablePatterns
        return new BufferedReader(new FileReader(file));
    }
}
