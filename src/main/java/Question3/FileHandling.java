package Question3;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/josue/a.md"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/josue/Library/Mobile Documents/com~apple~TextEdit/Documents/jo.txt"));

        String regex = "[a-zA-Z]+ (Grade: )[0-9]{1,3}";
        String line;

        while((line =bufferedReader.readLine()) != null){
            if(line.matches(regex)){
                String[] parts = line.split(":");

                for (String part : parts){
                  if(part.matches("(\\s+)?[0-9]{1,3}")){
                      String grado = part.trim();

                      if(Integer.parseInt(grado) >= 60) {
                          bufferedWriter.write(grado);
                          bufferedWriter.write(" ");
                      }
                  }

                }
            }
        }

        bufferedWriter.write("LOl");
        bufferedReader.close();
        bufferedWriter.close();
    }
}

