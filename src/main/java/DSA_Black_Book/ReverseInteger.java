package DSA_Black_Book;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(reverse(n));
        }
    }

    public static int reverse(int n){
        long rev=0;

        while(n!=0){
            int last=n%10;
            rev=rev*10+last;
            n/=10;
        }

        if (rev>Integer.MAX_VALUE ||rev<Integer.MIN_VALUE){
            return 0;
        }

        return (int)rev;
    }
}
