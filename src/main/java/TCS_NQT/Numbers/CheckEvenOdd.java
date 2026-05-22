package TCS_NQT.Numbers;

public class CheckEvenOdd {
    public static void checkEvenOdd(int num){
        if ((num&1)==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        checkEvenOdd(281);
    }
}
