package Bit_Manipulation;

public class ToggleABit {
    public static void main(String[] args) {
        int n=13,k=3;

        n=((1<<k)^n);
        System.out.println(n);
    }
}
