package TCS_NQT.Numbers;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void bruteForce(int n){
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void formula(int n){
        System.out.println((n*(n+1))/2);
    }

    public static int recursive(int n){
        if (n==1){
            return 1;
        }
        return n+recursive(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=5;
        bruteForce(5);
        formula(5);
        System.out.println(recursive(5));
        sc.close();

    }
}
