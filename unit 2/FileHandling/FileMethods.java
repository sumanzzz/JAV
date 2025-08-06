import java.io.File;
import java.io.FileNotFoundException;

public class FileMethods {
    public static void main(String[] args) throws FileNotFoundException {
        

        File file = new File("example.txt");
        System.out.println("is the file readable?"+file.canRead());
        System.out.println("is the file writable?"+file.canWrite());
        System.out.println("size of file in bytes:"+" "+file.length());
        System.out.println("file path:"+" "+file.getAbsolutePath());
    }
}
