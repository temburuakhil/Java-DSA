package DSA_Black_Book;

import java.util.*;

public class SecondHighestElement{

    public static int find(int[] arr){
        int max=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;

        for(int i:arr){
            if(i>max){
                sec=max;
                max=i;
            }else if(sec<i && i!=max){
                sec=i;
            }
        }

        return (sec==Integer.MIN_VALUE)?-1:sec;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        while(sc.hasNextInt()){
            int n=sc.nextInt();

            int[] arr= new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println(find(arr));
        }
    }
}