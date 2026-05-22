package TCS_NQT.Numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean checkArmstrong(int num){
        if (num == 0) {
            return true;
        }

        int digit=0;
        int temp1=num,temp2=num;

        while (num!=0){
            digit++;
            num/=10;
        }

        int arm=0;
        while (temp1!=0){
            arm=arm+(int)Math.pow((temp1%10),digit);
            temp1/=10;
        }

        return temp2==arm;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if (checkArmstrong(num)){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not an Armstrong Number");
        }

    }
}
