package DSA_Black_Book;

import java.util.*;

public class SecondHighestOccurrence {

    public static int findElement(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int n:arr){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }

        int maxFreq = 0;
        int secondMaxFreq = 0;
            
        for (int f:freq.values()){
            if (f>maxFreq){
                secondMaxFreq=maxFreq;
                maxFreq=f;
            } else if (f>secondMaxFreq && f<maxFreq) {
                secondMaxFreq=f;
            }
        }

        if (secondMaxFreq==0){
            return -1;
        }

        int ans = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            if(entry.getValue() == secondMaxFreq) {
                ans = Math.min(ans, entry.getKey());
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {4,4, 4, 5, 5,5,6, 6, 7,7};

        System.out.println(findElement(arr));
    }
}