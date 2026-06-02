package DSA_Black_Book;

import java.util.Scanner;
public class LargestDigitInNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(find(n));
        }
    }

    public static int find(int n){
        int large=0;

        while (n!=0){
            if(n%10>large){
                large=n%10;
            }

            n/=10;
        }

        return large;
    }
}
