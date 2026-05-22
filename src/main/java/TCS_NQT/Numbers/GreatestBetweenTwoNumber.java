package TCS_NQT.Numbers;

public class GreatestBetweenTwoNumber {
    public static boolean findGreat(int num1,int num2){
        return num1>num2;
    }
    public static void main(String[] args) {
        if (findGreat(-5,3)){
            System.out.println("Number 1 is Greater");
        }else System.out.println("Number 2 is Greater");
    }
}
