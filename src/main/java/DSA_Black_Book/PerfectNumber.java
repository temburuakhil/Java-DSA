package DSA_Black_Book;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(checkPerfectNumber(n));
        }
    }
        public static boolean checkPerfectNumber(int num) {
            if(num==1){
                return false;
            }
            int count=1;

            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                    count+=i;
                    if(i!=num/i){
                        count+=(num/i);
                    }
                }
            }
            return count==num;
        }
}
