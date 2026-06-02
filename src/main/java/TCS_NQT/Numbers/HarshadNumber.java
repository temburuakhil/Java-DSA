package TCS_NQT.Numbers;

public class HarshadNumber {

    public static void checkHarshad(int num){
        int sum=0,temp=num;

        while (num!=0){
            int last=num%10;
            sum+=last;
            num/=10;
        }

        if (temp%sum==0){
            System.out.println("Arshad Number");
        }else {
            System.out.println("Not a Arshad number");
        }
    }
    public static void main(String[] args) {
        checkHarshad(379);
    }
}
