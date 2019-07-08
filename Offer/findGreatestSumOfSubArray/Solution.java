package findGreatestSumOfSubArray;

public class Solution {
    // public int FindGreatestSumOfSubArray(int[] array) {
    // if (array.length <= 0) {
    // return 0;
    // }
    // if (array.length == 1) {
    // return array[0];
    // }
    // int max = 0, temp;
    // for (int i = 0; i < array.length; i++) {
    // temp = 0;
    // for (int j = i; j < array.length; j++) {
    // temp += array[j];
    // if (temp > max) {
    // max = temp;
    // }
    // }
    // }
    // return max;
    // }

    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0 || array == null) {
            return 0;
        }
        int Max = array[0];
        int Emax =  array[0];
        for (int i = 1; i < array.length; i++) {
            Emax = maxNum(array[i], Emax + array[i]);
            Max = maxNum(Emax, Max);
        }
        return Max;
    }

    private int maxNum(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}