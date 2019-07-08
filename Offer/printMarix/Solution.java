package printMarix;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        int line = matrix.length; // 行
        int row = matrix[0].length; // 列
        int count = 0, i = 0, j = 0;
        int shang = 0, xia = 0, zuo = 0, you = 0;
        while (true) {
            while (j < row - you) {
                count++;
                aList.add(matrix[i][j]);
                j++;
            }
            shang++;
            j--;
            i++;
            if (count == row * line)
                break;
            while (i < line - xia) {
                count++;
                aList.add(matrix[i][j]);
                i++;
            }
            if (count == row * line)
                break;
            you++;
            i--;
            j--;
            while (j >= 0 + zuo) {
                count++;
                aList.add(matrix[i][j]);
                j--;
            }
            if (count == row * line)
                break;
            xia++;
            j++;
            i--;
            while (i >= 0 + shang) {
                count++;
                aList.add(matrix[i][j]);
                i--;
            }
            if (count == row * line)
                break;
            zuo++;
            i++;
            j++;
        }
        // System.out.println(n);
        return aList;
    }

    // public static void main(String[] args) {
    // int[][] matrix = { { 1 }, { 5 }, { 9 }, { 13 } };
    // Solution solution = new Solution();
    // System.out.println(solution.printMatrix(matrix));
    // }
}