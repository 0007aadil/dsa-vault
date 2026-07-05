class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();
        int MOD = 1_000_000_007;

        int[][] dp = new int[n][n];
        long[][] cnt = new long[n][n];

        // sentinel: -1 means "unreachable"
        for (int[] row : dp) Arrays.fill(row, -1);

        dp[n - 1][n - 1] = 0;
        cnt[n - 1][n - 1] = 1;

        int[][] dirs = {{1, 0}, {0, 1}, {1, 1}}; // from below, from right, from diagonal

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == n - 1 && j == n - 1) continue; // S already set
                char c = board.get(i).charAt(j);
                if (c == 'X') continue; // obstacle, stays unreachable

                int best = -1;
                long ways = 0;

                for (int[] d : dirs) {
                    int pi = i + d[0], pj = j + d[1];
                    if (pi >= n || pj >= n || dp[pi][pj] == -1) continue;

                    if (dp[pi][pj] > best) {
                        best = dp[pi][pj];
                        ways = cnt[pi][pj];
                    } else if (dp[pi][pj] == best) {
                        ways = (ways + cnt[pi][pj]) % MOD;
                    }
                }

                if (best == -1) continue; // no valid predecessor, stays unreachable

                int value = (c == 'E') ? 0 : (c - '0');
                dp[i][j] = best + value;
                cnt[i][j] = ways;
            }
        }

        if (cnt[0][0] == 0) return new int[]{0, 0};
        return new int[]{dp[0][0], (int) cnt[0][0]};
    }
}