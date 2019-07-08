package findContinuousSequence;

import java.util.ArrayList;
import java.lang.Math;

public class Solution {
    // 只能处理奇数
    // public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
    // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    // ArrayList<Integer> temp = new ArrayList<>();
    // if (sum < 3)
    // return list;
    // for (int i = 3; i <= sum; i += 2) {
    // if (sum % i == 0) {
    // int tmp = sum / i;
    // int start = tmp - i / 2;
    // int end = tmp + i / 2;
    // if (start < 0) {
    // continue;
    // }
    // for (int j = start; j <= end; j++) {
    // if (j == 0)
    // j++;
    // temp.add(j);
    // }
    // list.add(new ArrayList<Integer>(temp));
    // temp.clear();
    // }
    // }
    // return list;
    // }

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for (int n = (int) Math.sqrt(2 * sum); n >= 2; n--) {
            if ((n & 1) == 1 && sum % n == 0 || (sum % n) * 2 == n) {
                for (int j = 0, k = sum / n - (n - 1) / 2; j < n; j++, k++) {   
                    // k的后面是为了处理偶数情况，（1）比如4,5,6,7，这4个数的和是22，平均值是5.5（小数部分为0.5，说明余数是除数的一半）；
                    // （2）sum / n是序列的中间值，往前推(n - 1) / 2就是起始值。
                    temp.add(k);
                }
                list.add(new ArrayList<Integer>(temp));
                temp.clear();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.FindContinuousSequence(3);
    }
}