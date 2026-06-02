package TCS_NQT.Numbers;

public class AdditionOfTwoFractions {

    public static int gcd(int a,int b){

//        if (b>a){
//            return gcd(b,a);
//        }
//
//        while (b<0){
//            int temp=a%b;
//            a=b;
//            b=temp;
//        }
//
//        return a;

        if (b>a){
            return gcd(b,a);
        }

        if (b==0){
            return a;
        }

        return gcd(b,a%b);

    }
    public static void addFrac(int num1,int den1,int num2,int den2){
        int den3=(den1*den2)/gcd(den1,den2);

        int num3=((den3/den1)*num1)+((den3/den2)*num2);

        int common=gcd(num3,den3);

        den3/=common;
        num3/=common;

        System.out.println(num3+"/"+den3);
    }
    public static void main(String[] args) {
        addFrac(5,2,1,2);
    }
}
