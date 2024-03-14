package Question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Library {

    String id;
    static int nextId = 0;
    String title ;

    public void printDetails(){
        System.out.println("Title: " + getTitle() + "Id " + getId() );
    }

    public Library( String title) {
        this.id = String.format("LOBY " + nextId++);
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public int getNextId() {
        return nextId;
    }

    public String getTitle() {
        return title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public static Library type(String fileName) throws IOException {
        System.out.println("Make sure your file is in this specific format: " +
                "Title(note that title must be first letter in upper case), TypeOf(Book / DVD), Number of Pages/ Duration, Genre(DVD.Genre.FICTION), authorName " );
        System.out.println("Note that those in parentheses are just examples not an actual format only one space after the comma");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        String title = "";
        String bookType = "";
        String name = "";
        Genre genre = Genre.FICTION;
        int durationOrNumPages = 0;
        while((line = bufferedReader.readLine()) != null){
            String[] parts = line.split(",");
            for(String part : parts){
                if(part.matches("[A-Z]{1}[a-z]{0,100}")){
                  title = part.trim();
                }
                else if(part.trim().matches("Book")|| part.trim().matches("DVD")){
                     bookType = part.trim();
                }
                else if(part.trim().matches("[0-9]+")){
                     durationOrNumPages = Integer.parseInt(part.trim());
                }
                else if(part.trim().matches("(Genre\\.)([A-Z]+)")){
                    String[] enumGets = part.split(".");
                    for(String enumG : enumGets) {
                        if(enumG.matches("[AZ]+"))
                        genre = Genre.valueOf(enumG.trim().toUpperCase());
                    }

                } else if (part.matches(" [A-Z]{1}[a-z]+ [A-Z]{1}[a-z]+ ?([A-Z]{1}[a-z]+)?")) {
                    name = part.trim();
                }else {
                    System.out.println("Wrong format ! " + part.trim());
                }

            }
        }
      return  getInstance(title,name,bookType,durationOrNumPages,genre);
    }

    public static void main(String[] args) {
        Library[] libraryObjects = {new Book("The Deep","Lopez", Genre.FICTION,100),
        new DVD("The Ocean","Carl",30, Genre.ACTION)};

        for(Library library : libraryObjects){
            library.printDetails(); // late binding since it happens at run time only at runtime
            // the compiler will know which print details needs to be called
        }
        try {


            Library unknownObjectFromFile = type("/Users/josue/Library/Mobile Documents/com~apple~TextEdit/Documents/jo.txt");
            unknownObjectFromFile.printDetails();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static Library getInstance(String title, String name,String type ,int durationOrPages, Genre genre){
        if(type.equals("Book")){
            return new Book(title, name, genre, durationOrPages);
        } else  {
            return new DVD(title,name,durationOrPages,genre);
        }
    }
}