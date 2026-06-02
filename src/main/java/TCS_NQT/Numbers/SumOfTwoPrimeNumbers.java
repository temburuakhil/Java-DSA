package TCS_NQT.Numbers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOfTwoPrimeNumbers {


    public static void sum(int num){

        boolean[] arr=new boolean[num+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;

        for (int i = 2; i*i <=num ; i++) {
            if (arr[i]){
                for (int j = i*i; j <=num ; j=j+i) {
                    arr[j]=false;
                }
            }
        }

        int num1=0,num2=0;
        boolean flag=false;

        for (int i = 2; i <=num ; i++) {
            if(arr[i]){
                int temp=num-i;
                if (arr[temp]){
                    num1=i;
                    num2=temp;
                    flag=true;
                    break;
                }
            }
        }
        if (flag){
            System.out.println("True");
            System.out.println("Two Numbers are : "+num1+" "+num2);
        }else {
            System.out.println("False");
        }

    }
    public static void main(String[] args) {
        sum(11);
    }
}
