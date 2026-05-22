package TCS_NQT.Numbers;

public class SumOfGPSeries {
    public static double sum(double a,double r,int n){
        if (r == 1)
            return a * n;

        // Use GP formula for r ≠ 1
        return a * (Math.pow(r, n) - 1) / (r - 1);
    }
    public static void main(String[] args) {
        double a = 2;
        double r = 3;
        int n = 4;

        System.out.println(sum(a,r,n));
    }
}
