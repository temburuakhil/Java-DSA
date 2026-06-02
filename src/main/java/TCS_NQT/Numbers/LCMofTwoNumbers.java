package TCS_NQT.Numbers;

public class LCMofTwoNumbers {

    public static int findGCD(int a,int b){
        if(b>a){
         return findGCD(b,a);
        }

        while (b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }

        return a;
    }
    public static int LCM(int a,int b){
        return (a*b)/findGCD(a,b);
    }
    public static void main(String[] args) {
        System.out.println(LCM(3,6));
    }
}
