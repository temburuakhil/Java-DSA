package TCS_NQT.Numbers;

public class AbudentNumber {
    public static void checkAbudent(int n){
        int sum=1;
        if (n<12){
            System.out.println("Not an Abudent Number");
            return;
        }
        for (int i = 2; i*i <=n ; i++) {
            if (n%i==0){
                sum+=i;
                if (i!=n/i){
                    sum+=(n/i);
                }
            }
        }

        if (n<sum){
            System.out.println("Abudent Number");
        }else {
            System.out.println("Not an Abudent Number");
        }
    }
    public static void main(String[] args) {
        checkAbudent(21);
    }
}
