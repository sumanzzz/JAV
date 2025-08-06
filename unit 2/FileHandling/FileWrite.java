import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("example.txt");
            writer.write("when u were here before");
            writer.write("coudnt look u in the eye");
            writer.write("ur just like an angel");
            writer.write("ur skin makes me cry");
            writer.write("u float like a feather");
            writer.write("in a beautiful world");
            writer.write("i wish i was special");
            writer.write("ur so fuckin special");
            writer.write("But im a creep");
            writer.write("Im a Weirdo");
            writer.write("What the hell im doin here");
            writer.write("i dont belong here");
            writer.close();
        }
        
        catch(IOException e){
            System.out.println(e.getMessage());
        }
       
       
    }
    
}