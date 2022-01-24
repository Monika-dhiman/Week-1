import java.util.Scanner;
import java.lang.Math;

public class MyClass {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        int count = CountDigits(number);
        
        double power = Math.pow(10, count-1);
        int divider = (int)power;
        int firstDigit = number / divider;
        number = number % divider;
        //System.out.println("first: " + firstDigit);
       // System.out.println(number);
        int lastDigit = number  % 10;
        //System.out.println("last: " + lastDigit);
        int middle = number / 10;
        //System.out.println("middle: " + middle);
        int swap = (lastDigit * divider) + (middle * 10) + firstDigit;
        System.out.println(swap);
        
        
      
      
    }
    public static int CountDigits(int n){
        int count =  0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }
}