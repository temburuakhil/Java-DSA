package DSA_Black_Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindAllTheDivisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(find(n));
        }
    }

    public static ArrayList<Integer> find(int n){
        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 1; i*i <=n ; i++) {
            if (n%i==0){
                list.add(i);
                if (i!=n/i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}
