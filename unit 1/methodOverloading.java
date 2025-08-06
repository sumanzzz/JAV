class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a , double b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}
public class methodOverloading{
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of two int values:"+" "+calc.add(4, 05));
        System.out.println("Addition of two double values:"+" "+calc.add(2.5, 5.8));
        System.out.println("Addition of three int values:"+" "+calc.add(4, 05,9));


    }
}