import java.util.Scanner;
import java.lang.Math;

//Functional Interface
interface MaxOfTwo{
    void maxNumber(int Num1,int Num2);
}
//main class
public class Lambda1{
    public static void main(String[] args) {
        int Num1,Num2;
        Scanner ic = new Scanner(System.in);
        try{
        System.out.println("Enter two Number:");
        Num1 = ic.nextInt();
        Num2 = ic.nextInt();
        //Lambda Expression
        MaxOfTwo obj = (int num1,int num2)-> System.out.println("Maximum Number between " + num1 + " and " + num2 + " is " + Math.max(num1, num2));
        obj.maxNumber(Num1, Num2);
        }
        finally{
            ic.close();
        }
        
    }
}