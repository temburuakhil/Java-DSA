package Maths_2;

public class EuclideanAlgo {

    public static int findGcd(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);

        if (b>a){
            return findGcd(b,a);
        }

        while (b>0){
            int temp=a%b;
            a=b;
            b=temp;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(findGcd(18,6));
    }
}
