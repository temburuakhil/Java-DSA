package DSA_Black_Book;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while(sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(check(n)?"Palindrome":"Not Palindrome");
        }
    }

    public static boolean check(int n){
        if (n<0){
            return false;
        }

        int rev=0,temp=n;
        while (n!=0){
            int last=n%10;
            rev=rev*10+last;
            n/=10;
        }

        return rev==temp;
    }
}
