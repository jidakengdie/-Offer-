package maxInWindows;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if (num.length == 0 || size == 0) {
            return list;
        }
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < num.length; i++) {
            // 从后面依次弹出队列中比当前num值小的元素，同时也能保证队列首元素为当前窗口最大值下标
            while (!deque.isEmpty() && num[i] >= num[deque.peekLast()]) {
                deque.pollLast();
            }
            // 当当前窗口移出队首元素所在的位置，即队首元素坐标对应的num不在窗口中，需要弹出
            while (!deque.isEmpty() && i - deque.getFirst() + 1 > size) {
                deque.pollFirst();
            }
            // 把每次滑动的num下标加入队列
            deque.addLast(i);
            // 当滑动窗口首地址i大于等于size时才开始写入窗口最大值，时间复杂度O(n)
            if (!deque.isEmpty() && deque.getLast() + 1 >= size) {
                list.add(num[deque.getFirst()]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] num = { 2, 3, 4, 2, 6, 2, 5, 1 };
        Solution solution = new Solution();
        solution.maxInWindows(num, 3);
    }
}