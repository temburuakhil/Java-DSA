package DSA_Black_Book;

import java.util.*;

class MoveZeroesArray{

    public static void moveZeroes(int[] arr) {
        System.out.println(Arrays.toString(arr));

        int k=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
        }

        for(int i=k;i<arr.length;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextInt()){
            int n=sc.nextInt();

            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            moveZeroes(arr);
        }
    }
}
