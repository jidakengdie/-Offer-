package multiply;

public class Solution {
    public int[] multiply(int[] A) {
        int[] B = null;
        if (A.length <= 0) {
            return B;
        }
        B = new int[A.length];
        B[0] = 1;
        // 下三角
        for (int i = 1; i < A.length; i++) {
            B[i] = B[i - 1] * A[i-1];
        }
        // 上三角
        int tmp = 1;
        for (int j = A.length - 2; j >= 0; j--) {
            tmp *= A[j + 1];
            B[j] *= tmp;
        }
        return B;
    }
}