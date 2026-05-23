package TCS_NQT.Numbers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindPrimeFactors {

//    Brute Force Approach
//    public static boolean checkPrime(int n){
//
//        for (int i = 2; i*i <=n ; i++) {
//            if (n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void findPrimeFact(int n){
//
//        List<Integer> list=new ArrayList<>();
//        for (int i = 2; i*i <=n ; i++) {
//            if (n%i==0){
//                if (checkPrime(i)){
//                    list.add(i);
//                }
//                if (i!=n/i){
//                    if(checkPrime(n/i)){
//                        list.add(n/i);
//                    }
//                }
//            }
//        }
//        Collections.sort(list);
//        System.out.println(list);
//    }

    public static void findPrimeFact(int n){
        List<Integer> list=new ArrayList<>();
        if (n%2==0){
            list.add(2);
            while (n%2==0){
                n/=2;
            }
        }

        for(int i=2;i *i<=n;i++){
            if (n%i==0){
                list.add(i);
                while (n%i==0){
                    n/=i;
                }
            }
        }
        if (n>0){
            list.add(n);
        }

        System.out.println(list);

    }
    public static void main(String[] args) {
        findPrimeFact(60);
    }
}
