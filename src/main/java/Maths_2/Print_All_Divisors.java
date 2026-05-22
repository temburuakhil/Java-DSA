package Maths_2;

public class Print_All_Divisors {

    public static void printDivisors(int num){
        for (int i = 1; i <=Math.sqrt(num) ; i++) {
            if(num%i==0){
                System.out.print(i+ " ");
                if (i!=num/i){
                    System.out.print(num/i+ " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        printDivisors(36);
    }
}
