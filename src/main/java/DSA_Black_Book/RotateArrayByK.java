package DSA_Black_Book;

import java.util.*;

class RotateArrayByK{

    public static void rotate(int[] arr,int k){
        System.out.println(Arrays.toString(arr));
        int n=arr.length;
        k%=n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(sc.hasNextInt()){
            int n=sc.nextInt();
            int k=sc.nextInt();

            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            rotate(arr,k);
        }
    }
}
