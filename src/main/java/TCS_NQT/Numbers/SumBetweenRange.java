package TCS_NQT.Numbers;

public class SumBetweenRange {

    public static void sumRange(int l,int r){
        System.out.println("The Sum is: "+(r*(r+1)/2 - (l-1)*(l)/2));
    }
    public static void main(String[] args) {
        sumRange(5,9);
    }
}
