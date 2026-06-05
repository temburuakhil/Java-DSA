package DSA_Black_Book;
import java.util.*;
public class CountOfOddInArray {
    public static int countOdd(int[] arr){
        int count=0;

        for(int i:arr){
            if(i%2!=0) count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(countOdd(arr));
    }
}
