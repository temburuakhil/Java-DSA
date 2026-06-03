package DSA_Black_Book;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextInt()){
            int n1=sc.nextInt();
            int n2=sc.nextInt();

            System.out.println(gcd(n1,n2));
        }

    }

    public static int gcd(int a, int b) {
        if(b==0){
            return a;
        }
        if(a<b){
            gcd(b,a);
        }

        return gcd(b,a%b);
    }
}
