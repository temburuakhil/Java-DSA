package TCS_NQT.Numbers;

public class AutomorphicNumber {
    public static boolean checkAuto(int num){
        int mul=num*num;

        while (num!=0){
            int mulLast=mul%10;
            int numLast=num%10;

            if (mulLast!=numLast){
                return false;
            }
            mul/=10;
            num/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        if (checkAuto(2)) {
            System.out.println("Automorphic Number");
        }else{
            System.out.println("Not a Automorphic Number");
        }
    }
}
