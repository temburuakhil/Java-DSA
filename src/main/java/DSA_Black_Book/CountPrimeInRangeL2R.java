package DSA_Black_Book;

import java.util.Arrays;

public class CountPrimeInRangeL2R {

    static int[] count(int[][] queries) {

        int[] ans = new int[queries.length];

        int maxR = 0;

        for(int[] q : queries) {
            maxR = Math.max(maxR, q[1]);
        }

        int[] prime = sieve(maxR);

        int[] prefix = new int[maxR + 1];

        for(int i = 1; i <= maxR; i++) {
            prefix[i] = prefix[i - 1] + prime[i];
        }

        for(int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            ans[i] = prefix[r] - (l > 0 ? prefix[l - 1] : 0);
        }

        return ans;
    }

    static int[] sieve(int r) {

        int[] prime = new int[r + 1];

        Arrays.fill(prime, 1);

        if(r >= 0) prime[0] = 0;
        if(r >= 1) prime[1] = 0;

        for(int i = 2; i * i <= r; i++) {

            if(prime[i] == 1) {

                for(int j = i * i; j <= r; j += i) {
                    prime[j] = 0;
                }
            }
        }

        return prime;
    }

    public static void main(String[] args) {

        int[][] queries = {
                {2, 5},
                {4, 7}
        };

        System.out.println(Arrays.toString(count(queries)));
    }
}