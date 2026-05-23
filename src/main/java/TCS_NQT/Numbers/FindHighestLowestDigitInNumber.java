package TCS_NQT.Numbers;

import java.net.Socket;
import java.util.Scanner;

public class FindHighestLowestDigitInNumber {
    public static void checkHighLow(int num){
        int high=Integer.MIN_VALUE;
        int low=Integer.MAX_VALUE;

        while (num!=0){
            int last=num%10;
            if (last>high){
                high=last;
            }
            if (last<low){
                low=last;
            }
            num/=10;
        }

        System.out.println("Highest Digit: "+high);
        System.out.println("Lowest Digit: "+low);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        checkHighLow(num);
    }
}
