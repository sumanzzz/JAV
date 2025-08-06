import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("example.txt");

        try{
            Scanner read = new Scanner(file);
            while(read.hasNextLine()){
                String line = read.nextLine();
                System.out.println(line);
            }
            read.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
}
