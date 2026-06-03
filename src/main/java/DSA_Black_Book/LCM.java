package DSA_Black_Book;

import java.util.Arrays;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        while (sc.hasNextInt()){
            int n1=sc.nextInt();
            int n2=sc.nextInt();

            System.out.println(Arrays.toString(lcmAndGcd(n1,n2)));
        }
    }

    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gcdVal=gcd(a,b);

        int lcm=(a*b)/gcdVal;

        return new int[]{lcm,gcdVal};
    }

    public static int gcd(int a,int b){
        if(b==0) return a;

        if(b>a){
            gcd(b,a);
        }

        return gcd(b,a%b);
    }
}
