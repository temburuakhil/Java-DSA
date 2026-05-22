package TCS_NQT.Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class FindPrimeWithinRange {
    public static void findRange(int num1,int num2){
        boolean[] arr=new boolean[num2+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;

        // Sieve of Eratosthenes
        for (int i = 2; i*i <=num2 ; i++) {
            if (arr[i]){
            for (int j = i*i; j <=num2 ; j=j+i) {
                arr[j]=false;
            }
            }
        }
        for (int i = num1; i <= num2; i++) {
            if (arr[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
       findRange(5,52);
    }
}
