package TCS_NQT.Numbers;

public class Replace0With1 {

    public static void replace(int num){
        System.out.println(num);
        int rev=0;
        while (num!=0){
            int last=num%10;
            if (last==0){
                rev=rev*10+1;
            }else {
                rev=rev*10+last;
            }
            num/=10;
        }
        int ans=0;
        while (rev!=0){
            ans=(ans*10)+(rev%10);
            rev/=10;
        }

        System.out.println(ans);
    }
    public static void main(String[] args) {
        replace(102510);
    }
}
