package DSA_Black_Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestOccurringElementInAnArray {

    public static int findElement(int[] arr){
        Map<Integer,Integer> freq=new HashMap<>();

        for (int i : arr) {
            if (freq.containsKey(i)){
                freq.put(i,freq.get(i)+1);
            }else {
                freq.put(i,1);
            }
        }

        int max=0,num=0;

        for(Map.Entry<Integer,Integer> map: freq.entrySet()){
            int key=map.getKey();
            int val=map.getValue();

            if (max<val){
                max=val;
                num=key;
            }
            else if(max==val && num>key){
                num=key;
            }
        }

        return num;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (sc.hasNextInt()){

            int n=sc.nextInt();
            int[] arr= new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }

            System.out.println("Highest Occurrence= "+findElement(arr));
        }
    }
}
