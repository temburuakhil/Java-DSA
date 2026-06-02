package Bit_Manipulation;

public class UnsetABit {
    public static void main(String[] args) {
        int n=13,k=2;

        n=(~((1<<k))&n);
        System.out.println(n);
    }
}
