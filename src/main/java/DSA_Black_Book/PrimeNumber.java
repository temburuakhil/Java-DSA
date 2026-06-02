package DSA_Black_Book;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(isPrime(n));
        }
    }

    static boolean isPrime(int n) {
        if(n==1)return false;
        // code here
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}
