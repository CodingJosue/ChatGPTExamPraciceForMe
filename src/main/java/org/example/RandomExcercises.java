package org.example;

import java.io.*;

public class RandomExcercises {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/josue/Library/Mobile Documents/com~apple~TextEdit/Documents/jo.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/josue/a.md"));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (!(line.trim().isEmpty() || line.trim().isBlank())) {
                String cleanLine = line.replaceAll("[^a-zA-Z0-9]", "");
                bufferedWriter.write(cleanLine + "\n");
            }

        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
