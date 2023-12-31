public class NewYearResolution {
    static boolean isPossibleDP(int index, int sum, int[] coins, Boolean dp[][]) {
        if (sum > 0 && (sum % 20 == 0 || sum % 24 == 0 || sum == 2024)) {
            return true;
        }
        if (index >= coins.length) {
            return false;
        }
        if (dp[index][sum] != null) {
            return dp[index][sum];
        }
        return dp[index][sum] = isPossibleDP(index + 1, sum, coins, dp)
                || isPossibleDP(index + 1, sum + coins[index], coins, dp);
    }

    static boolean isPossibleRecurssive(int index, int sum, int[] coins) {
        if (sum > 0 && (sum % 20 == 0 || sum % 24 == 0 || sum == 2024)) {
            return true;
        }
        if (index >= coins.length) {
            return false;
        }
        return isPossibleRecurssive(index + 1, sum, coins)
                || isPossibleRecurssive(index + 1, sum + coins[index], coins);
    }

    static boolean isPossible(int N, int[] coins) {
        // code here
        // Recurssive
        // return isPossibleRecurssive(0,0,coins);

        // DP
        Boolean dp[][] = new Boolean[N][2025];
        return isPossibleDP(0, 0, coins, dp);
    }

    public static void main(String args[]) {
        int coins[] = {5, 8, 9, 10, 14, 2, 3, 5};
        System.out.println(isPossible(8, coins));
    }
}