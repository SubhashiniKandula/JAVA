import java.util.ArrayList;
import java.util.List;
public class LuckyNumber {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int min = matrix[i][0];
            int col = 0;
            // Find minimum element in the current row
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }
            // Check if it is the maximum in its column
            boolean lucky = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][col] > min) {
                    lucky = false;
                    break;
                }
            }
            if (lucky) {
                ans.add(min);
            }
        }
        return ans;
    }
}

