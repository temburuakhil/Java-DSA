package TCS_NQT.Numbers;

import java.util.Scanner;

public class CheckPalindrome {
    public static void checkPalindrome(int num){
        int org=0,te=num;

        while (num>0){
            int temp=num%10;
            org=org*10+temp;
            num/=10;
        }

        if (te==org){
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not a Palindrome Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        checkPalindrome(num);

    }
}
