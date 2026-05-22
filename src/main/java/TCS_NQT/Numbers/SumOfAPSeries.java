package TCS_NQT.Numbers;

public class SumOfAPSeries {

    static void sum(int n,int a,int d){
        int sum=a,totalSum=a;
        System.out.print(a+" ");
        for (int i = 0; i < n-1; i++) {
            sum+=d;
            totalSum+=sum;
            System.out.println(totalSum);
            System.out.print(sum+" ");
        }
        System.out.println("Sum "+totalSum);
    }
    public static void main(String[] args) {
        sum(4,2,2);
    }
}
