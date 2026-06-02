package TCS_NQT.Numbers;

public class GCDofTwoNumbers {
    public static int gcd(int num1,int num2){
        num1=Math.abs(num1);
        num2=Math.abs(num2);

        if (num2>num1){
            return gcd(num2,num1);
        }

        while (num2!=0){
            int temp=num1%num2;
            num1=num2;
            num2=temp;
        }

        return num1;
    }
    public static void main(String[] args) {
        System.out.println(gcd(18,4));
    }
}
