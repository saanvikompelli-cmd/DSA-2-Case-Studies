import java.util.*;

public class RodCuttingDP {

    public static void main(String[] args) {

        int[] price =
            {0,1,5,8,9,10,17,17,20,24,30};

        int n = 10;

        int[] dp = new int[n + 1];
        int[] cut = new int[n + 1];

        for(int i = 1; i <= n; i++) {

            int best = -1;
            int bestCut = 0;

            for(int k = 1; k <= i; k++) {

                int candidate =
                    price[k] + dp[i-k];

                if(candidate > best) {
                    best = candidate;
                    bestCut = k;
                }
            }

            dp[i] = best;
            cut[i] = bestCut;
        }

        System.out.println(
            "Maximum Revenue = " + dp[n]);

        System.out.print(
            "Optimal Cuts: ");

        int length = n;

        while(length > 0) {

            System.out.print(
                cut[length] + " ");

            length -= cut[length];
        }

        System.out.println();
    }
}