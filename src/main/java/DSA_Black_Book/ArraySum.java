package DSA_Black_Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> lis= new ArrayList<>();
        lis.add(54);
        lis.add(43);
        lis.add(2);
        lis.add(1);
        lis.add(5);

        System.out.println(arraySum(lis));
    }

    public static int arraySum(List<Integer> arr) {
        // code here
        int count=0;
        for(int n:arr){
            count+=n;
        }

        return count;
    }
}
