package Maths_2;

public class Armstrong_Number {
    public static void checkArmstrong(int num){
        int count=(int)Math.log10(num)+1,res=0,temp=num;

        while(num>0){
            int last=num%10;
            res=res+(int)Math.pow(last,count);
            num/=10;
        }

        if(res==temp){
            System.out.println("It is a Armstrong Number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }
    }
    public static void main(String[] args) {
        checkArmstrong(1634);
    }
}
