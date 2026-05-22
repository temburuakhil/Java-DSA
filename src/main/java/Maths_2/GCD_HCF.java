package Maths_2;

public class GCD_HCF {
    public static void find_gcd(int num1,int num2){
        num1=Math.abs(num1);
        num2=Math.abs(num2);
        int least=1;

        for (int i = 1; i <= Math.min(num1,num2); i++) {
            if (num1%i==0 && num2%i==0){
                least=i;
            }
        }
        System.out.println("GCD is "+least);
    }
    public static void main(String[] args) {
        find_gcd(11,15);
    }
}
