package DSA_Black_Book;

import java.util.Scanner;
import java.util.Arrays;

public class LargestElementInAnArray{

    public static int findHighest(int[] arr){
        int max=0;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }

        return max;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        while(sc.hasNextInt()){
            int n=sc.nextInt();

            int[] arr= new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println(findHighest(arr));
        }
    }
}