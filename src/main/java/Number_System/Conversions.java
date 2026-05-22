package Number_System;

public class Conversions {

    public static char getChar(int ch){
        switch (ch){
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15:
                return 'F';
            default:
                return (char) (ch+'0');
        }
    }

    public static int getDigit(char ch){
        switch (ch){
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return ch-'0';
        }
    }

    public static void BaseToDecimal(String input,int base){
        int pos=0,res=0;
        int len=input.length();

        for (int i = len-1; i >=0 ; i--) {
            int digit= getDigit(input.charAt(i));
            res=res+(digit*(int)Math.pow(base,pos++));
        }
        System.out.println("Converted Number is: "+res);
    }

    public static void decimalToBinary(int input,int base){
        StringBuilder stringBuilder=new StringBuilder();

        while(input>0){
            int rem=input%base;
            char ch=getChar(rem);
            stringBuilder.append(ch);
            input=input/base;
        }

        System.out.println("The Binary Number is: "+stringBuilder.reverse());

    }
    public static void main(String[] args) {
//        BaseToDecimal("6B",16);
        decimalToBinary(107,16);
    }
}
