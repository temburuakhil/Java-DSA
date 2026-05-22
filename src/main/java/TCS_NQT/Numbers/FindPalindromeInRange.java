package TCS_NQT.Numbers;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class FindPalindromeInRange {
    public static void findPalindrome(int num){
        for (int i = 1; i <=num ; i++) {
            if (checkPalindrome(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkPalindrome(int num){
        int temp=num,rev=0;

        while (num>0){
            int last=num%10;
            rev=rev*10+last;
            num/=10;
        }

        return temp==rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int num=sc.nextInt();
        findPalindrome(num);
    }
}
