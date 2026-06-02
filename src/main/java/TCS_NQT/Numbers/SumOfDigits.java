package TCS_NQT.Numbers;

public class SumOfDigits {

    //Brute Force
    public static int sum(int n){

        while (n/10!=0){
            int sum=0;
            while (n!=0){
                int last=n%10;
                sum+=last;
                n/=10;
            }
            n=sum;
        }

        return n;
    }

    //By Formula

    public static int formula(int num){
        if (num==0){
            return 0;
        }

        return 1+(num-1)%9;
    }
    public static void main(String[] args) {
        System.out.println(sum(375));
        System.out.println(formula(375));
    }
}
