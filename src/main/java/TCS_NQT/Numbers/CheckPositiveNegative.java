package TCS_NQT.Numbers;

public class CheckPositiveNegative {
    public static void check(int num){
        if (num<0){
            System.out.println("Negative");
        } else if (num==0) {
            System.out.println("Zero");
        } else
            System.out.println("Positive");
    }
    public static void main(String[] args) {
        check(-25);
    }
}
