package DSA_Black_Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class UniquePrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(primeFac(n));
        }
    }

    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();

        boolean[] arr=new boolean[n+1];
        Arrays.fill(arr,true);

        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j=j+i){
                    arr[j]=false;
                }
            }
        }

        for(int i=2;i<n;i++){
            if(arr[i]){
                if(n%i==0){
                    ans.add(i);
                }

            }
        }
        if(arr[n]){
            ans.add(n);
        }

        Collections.sort(ans);

        return ans;
    }
}
