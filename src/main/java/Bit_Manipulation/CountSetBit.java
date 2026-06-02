package Bit_Manipulation;

public class CountSetBit {
    public static void main(String[] args) {
        int n=-13;
        //First Method
        System.out.println(Integer.bitCount(n));

        //Second Method(N=Brian Kennigan Algo)
        int count=0;

        while (n!=0){
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
    }
}
