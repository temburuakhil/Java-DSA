package TCS_NQT.Numbers;

import java.util.Scanner;

public class Factorial {
    public static int findFact(int num){
        if (num==0){
            return 1;
        }
        return num * findFact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println(findFact(num));
    }
}
