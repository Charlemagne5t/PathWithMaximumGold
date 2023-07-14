import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void getMaximumGoldTest1() {
        int[][] grid = {
                {0, 6, 0},
                {5, 8, 7},
                {0, 9, 0}
        };
        int expected = 24;
        int actual = new Solution().getMaximumGold(grid);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaximumGoldTest2() {
        int[][] grid = {
                {1, 0, 7},
                {2, 0, 6},
                {3, 4, 5},
                {0, 3, 0},
                {9, 0, 20}
        };
        int expected = 28;
        int actual = new Solution().getMaximumGold(grid);

        Assertions.assertEquals(expected, actual);
    }
}
