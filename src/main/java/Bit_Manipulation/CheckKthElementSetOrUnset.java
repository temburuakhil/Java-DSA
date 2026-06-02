package Bit_Manipulation;

public class CheckKthElementSetOrUnset {
    public static void main(String[] args) {
        int n=13,k=1;

        if (((1<<k)&n)>0){
            System.out.println("Set");
        }else {
            System.out.println("Unset");
        }
    }
}
