package DSA_Black_Book;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(armstrongNumber(n));
        }
    }

    static boolean armstrongNumber(int n) {
        // code here
        int count=0,temp=n,ans=0;
        while(n!=0){
            count++;
            n/=10;
        }

        n=temp;

        while(n!=0){
            int last=n%10;
            ans=ans+((int)Math.pow(last,count));
            n/=10;
        }

        return ans==temp;
    }
}
