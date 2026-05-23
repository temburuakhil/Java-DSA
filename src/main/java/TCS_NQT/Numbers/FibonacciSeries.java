package TCS_NQT.Numbers;

import java.util.Scanner;

public class FibonacciSeries {

    public static void fibSeries(int num){
        if (num==0){
            System.out.print(num);
            return;
        }
        if (num==1){
            System.out.print("0 "+ num);
            return;
        }
        int secondLast=0,last=1;

        System.out.print(secondLast+" "+last+" ");

        for (int i = 2; i <=num ; i++) {
            int next=secondLast+last;
            secondLast=last;
            last=next;
            System.out.print(last+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        fibSeries(num);
    }
}
