class Animal{
    public void Sound(){
        System.out.println("Animal Sound");
    }
}
class dog extends Animal{
    @Override
    public void Sound(){
        System.out.println("dog barks...");
    }
}
public class methodOverriding {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.Sound();

        dog Dog = new dog();
        Dog.Sound();
    }
    
}
