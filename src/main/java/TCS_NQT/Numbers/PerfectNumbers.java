package TCS_NQT.Numbers;

import java.util.Scanner;

public class PerfectNumbers {
    public static void checkPerfect(int num){
        int count=1;

        for (int i = 2; i*i <=num ; i++) {
            if (num%i==0){
                count=count+i;

                if (i!= num/i){
                    count+=num/i;
                }
            }
        }

        if (num==count){
            System.out.println("Perfect Number");
        }else System.out.println("Not a Perfect Number");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        checkPerfect(num);
    }
}
