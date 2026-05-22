package TCS_NQT.Numbers;

public class GreatestBetweenThreeNumbers {
    public static void check(double n1,double n2,double n3) {
        if (n1>n2 && n1>n3){
            System.out.println("Number 1 is great");
        } else if (n2>n1 && n2>n3) {
            System.out.println("Number 2 is great");
        }else {
            System.out.println("Number 3 is great");
        }
    }
    public static void main(String[] args) {
        check(2,8,-3);
    }
}
