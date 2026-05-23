package TCS_NQT.Numbers;

public class FindPower {

    public static int pow(int n1,int n2){

        if (n2==0){
            return 1;
        }

        int result=pow(n1,n2/2);

        int ans=result*result;
        if (n2%2==1){
            ans=n1*ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(pow(4,3));
    }
}
