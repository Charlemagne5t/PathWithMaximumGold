public class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    max = Math.max(max, dfs(grid, i, j, 0));
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j, int sum) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] == -1)
            return sum;

        sum += grid[i][j];
        int t = grid[i][j];

        grid[i][j] = -1;

        int max = Math.max(Math.max(dfs(grid, i + 1, j, sum), dfs(grid, i - 1, j, sum)), Math.max(dfs(grid, i, j + 1, sum), dfs(grid, i, j - 1, sum)));

        grid[i][j] = t;

        return Math.max(max, sum);

    }
}

