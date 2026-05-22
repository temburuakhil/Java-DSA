package Maths_2;

import static Maths_2.EuclideanAlgo.findGcd;

public class LCM {
    public static int findLcm(int num1,int num2){
        num1=Math.abs(num1);
        num2=Math.abs(num2);

        if (num1==0 || num2==0) return 0;

        return (num1*num2)/findGcd(num1,num2);
    }
    public static void main(String[] args) {
        System.out.println(findLcm(12,18));
    }
}
