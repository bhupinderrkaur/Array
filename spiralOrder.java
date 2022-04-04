public class Solution {
    public int[] spiralOrder(final int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int top = 0, bottom = m-1, left = 0, right = n-1;
        // dir 1 -> left to right
        // dir 2 -> top to bottom
        // dir 3 -> right to left
        // dir 4 -> bottom to top
        int dir = 1;
        int[] res = new int[m*n];
        int count = 0;
        while (top <= bottom && left <= right) {
            if (dir == 1 && count < res.length) {
                for (int i = left; i <= right; i++) {
                    res[count] = A[top][i];
                    count++;
                }
                top++;
                dir = 2;
            }
            if (dir == 2 && count < res.length) {
                for (int i = top; i <= bottom; i++) {
                    res[count] = A[i][right];
                    count++;
                }
                right--;
                dir = 3;
            }
            if (dir == 3 && count < res.length) {
                for (int i = right; i >= left; i--) {
                    res[count] = A[bottom][i];
                    count++;
                }
                bottom--;
                dir = 4;
            }
            if (dir == 4 && count < res.length) {
                for (int i = bottom; i >= top; i--) {
                    res[count] = A[i][left];
                    count++;
                }
                left++;
                dir = 1;
            }
        }
        return res;
    }
}
