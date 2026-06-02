package DSA_Black_Book;

import java.util.*;
public class CountOfOddDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(count(n));
        }

    }

    public static int count(int n){
        int c=0;

        while(n!=0){
            int last=n%10;
            if(last%2!=0){
                c++;
            }
            n/=10;
        }
        return c;
    }
}
