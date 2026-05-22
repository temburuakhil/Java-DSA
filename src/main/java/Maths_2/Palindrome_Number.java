package Maths_2;

public class Palindrome_Number {
    public static void checkPalindrome(int num){
        int rev=0,temp=num;
        while(num>0){
            int last=num%10;
            rev=rev*10+last;
            num/=10;
        }
        if (rev==temp){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
    public static void main(String[] args) {
        checkPalindrome(1222);
    }
}
