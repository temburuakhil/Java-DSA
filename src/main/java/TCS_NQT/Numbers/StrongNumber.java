package TCS_NQT.Numbers;

public class StrongNumber {

    public static int fact(int n){
        if (n==0){
            return 1;
        }

        return n*fact(n-1);
    }

    public static void checkStrong(int num){
        int sum=0,temp=num;

        while (num!=0){
            int last=num%10;
            sum=sum+fact(last);
            num/=10;
        }
        if (temp==sum){
            System.out.println("Strong Number");
        }else {
            System.out.println("Not a Strong Number");
        }
    }
    public static void main(String[] args) {
        checkStrong(201);
    }
}
