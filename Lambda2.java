import java.util.Scanner;

//Functional Interface
interface NearestEvenNumber{
    void nearestEven(long Num);
}
public class Lambda2 {
    public static void main(String[] args) {
        long Num;
        Scanner ic = new Scanner(System.in);
        try{
        System.out.println("Enter Number:");
        Num = ic.nextLong();

        //Lambda Expression
        NearestEvenNumber obj = (long num)-> System.out.println("Next Even Number is " + ((num + 2) - (num % 2)));
        obj.nearestEven(Num);
        }
        finally{
            ic.close();
        }
        
    }
}
