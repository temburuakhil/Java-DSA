package TCS_NQT.Numbers;

public class Permutations {
    //Formula = N!/(N-r)!

    public static int fact(int n){

        if (n==1){
            return 1;
        }

        return n*fact(n-1);
    }
    public static void findPermu(int n,int r){
        int perm=fact(n)/fact((n-r));

        System.out.println(perm);
    }
    public static void main(String[] args) {
         findPermu(6,4);
    }
}