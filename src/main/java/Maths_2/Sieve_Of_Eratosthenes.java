package Maths_2;

import java.util.Arrays;

public class Sieve_Of_Eratosthenes {

    public static void find_prime(int num){
        boolean[] arr=new boolean[num+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        int sqrt=(int)Math.sqrt(num);

        for (int i = 2; i < sqrt; i++) {
            if (arr[i]){
                for (int j = i*i; j <=num ; j=j+i) {
                    arr[j]=false;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            if (arr[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int num=3;
        find_prime(num);
    }
}
