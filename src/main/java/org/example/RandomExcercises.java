package org.example;

import java.io.*;

public class RandomExcercises {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/josue/Library/Mobile Documents/com~apple~TextEdit/Documents/jo.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/josue/sample.txt"));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String lineCleaned = line.replaceAll("[^a-zA-Z]", "");

            if (!lineCleaned.isEmpty()) {
                bufferedWriter.write(lineCleaned);
                bufferedWriter.newLine();
            }

        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}

