package gDc;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number :");
        long num1=s.nextInt();
        System.out.print("enter second number  :");
        long num2=s.nextInt();
        long  min=Math.min(num1, num2);
        for(min=min;min>=0;min--){
            if(num1%min==0 && num2%min==0){
            System.out.println(min +" is the GCD of "+ num1 +","+ num2);
            System.out.println("its the LCM "+(num1*num2)/min);
            break;
        }
        }
    }

}
