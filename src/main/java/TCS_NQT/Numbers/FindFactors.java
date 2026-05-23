package TCS_NQT.Numbers;

import java.util.*;

public class FindFactors {
    public static void findFact(int n){
        List<Integer> list=new ArrayList<>();

        for (int i = 1; i <Math.sqrt(n) ; i++) {
            if (n%i==0){
                list.add(i);

                if (i!=n/i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        findFact(24);
    }
}

