package Question3;

import java.io.*;

public class RandomFileExcercises {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/josue/a.md"));
        BufferedWriter bufferedWriter  = new BufferedWriter(new FileWriter("/Users/josue/Library/Mobile Documents/com~apple~TextEdit/Documents/jo.txt"));

        int count = 0;
        String line;
        while((line = bufferedReader.readLine()) != null){
            count++;
            if(count == 1){
                String regex = line.replaceAll("[0-9]","oppadsa");
                bufferedWriter.write(regex);
                bufferedWriter.write("lol");
            }
        }
        bufferedReader.close();
        bufferedWriter.close();

    }
}
