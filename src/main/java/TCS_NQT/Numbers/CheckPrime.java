package TCS_NQT.Numbers;

import java.util.Scanner;

public class CheckPrime {
    public static boolean checkPrime(int num){
        num=Math.abs(num);
        if (num < 2) {
            return false;
        }
        for (int i=2;i * i <= num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if (checkPrime(num)){
            System.out.println("Prime Number");
        }else System.out.println("Not a Prime Number");
    }
}
