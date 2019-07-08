package getUglyNumber_Solution;

import java.util.ArrayList;

class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 6) {
            return index;
        }
        int p2 = 0, p3 = 0, p5 = 0, result = 1;
        ArrayList<Integer> queue = new ArrayList<Integer>();
        queue.add(result);
        while (index > queue.size()) {
            result = minNumber(queue.get(p2) * 2, minNumber(queue.get(p3) * 3, queue.get(p5) * 5));
            if (queue.get(p2) * 2 == result)
                p2++;
            if (queue.get(p3) * 3 == result)
                p3++;
            if (queue.get(p5) * 5 == result)
                p5++;
            queue.add(result);
        }
        return result;
    }

    private int minNumber(int num1, int num2) {
        return (num1 > num2) ? num2 : num1;
    }

    // public static void main(String[] args) {
    //     Solution s1 = new Solution();
    //      for (int i = 0; i < 100; i++) {
    //          System.out.println(s1.GetUglyNumber_Solution(i));
    //      }
    //     System.out.println(s1.GetUglyNumber_Solution(8));
    // }
}