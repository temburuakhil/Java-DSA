package Maths_2;

public class Prime_Number {

    public static void checkPrime(int num){
        if(num%2==0 || num==1){
            System.out.println("Not a prime number");
        }else {
            boolean flag=false;
            for (int i = 2; i <=Math.sqrt(num) ; i++) {
                if (num % i == 0) {
                    flag = true;
                    System.out.println("Not a prime number");
                    break;
                }
            }
            if (!flag){
                System.out.println("Prime number");
            }
        }
    }
    public static void main(String[] args) {
        checkPrime(1);
    }
}
