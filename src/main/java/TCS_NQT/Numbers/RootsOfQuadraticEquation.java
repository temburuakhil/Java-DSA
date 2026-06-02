package TCS_NQT.Numbers;

public class RootsOfQuadraticEquation {

    public static void findRoots(int a,int b,int c){
        int discr=b*b-(4*a*c);
        double sqrtVal=Math.sqrt(discr);
        if (discr>0){
            double root1=((-b)+sqrtVal)/(2.0*a);
            double root2=((-b)-sqrtVal)/(2.0*a);

            System.out.println("Roots are : "+root1+" "+root2);
        } else if (discr==0) {
            System.out.println("Root1 and Root2 are: "+(-b/(2*a)));
        }else {
            double realPart = (-b) / (2.0 * a);
            System.out.println(realPart + " + i" + sqrtVal);
            System.out.println(realPart + " - i" + sqrtVal);
        }
    }

    public static boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        if(n<10){
            return false;
        }
        int sum=0;
        while(n>10){
            while(n!=0){
                int last=n%10;
                sum=sum+(last*last);
                n/=10;
            }
            n=sum;
            System.out.println(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        findRoots(1,1,1);

        System.out.println(isHappy(19));
    }
}
