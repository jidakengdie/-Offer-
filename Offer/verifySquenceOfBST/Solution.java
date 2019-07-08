package verifySquenceOfBST;

public class Solution {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length <= 0) {
            return false;
        }
        return verifySquenceOfBST(sequence, 0, sequence.length - 1);
    }

    private boolean verifySquenceOfBST(int[] sequence, int start, int end) {
        if (start >= end) {
            return true;
        }
        int i = 0, mid = 0, flag = 0;
        for (i = start; i <= end; i++) {
            if (sequence[i] > sequence[end]) {
                if (flag == 0) {
                    flag = 1;
                    mid = i - 1;
                }
            }
            if (sequence[i] < sequence[end] && flag == 1) {
                return false;
            }
        }
        return verifySquenceOfBST(sequence, start, mid) && verifySquenceOfBST(sequence, mid + 1, end-1);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {4,8,7,6,11,10,1,12,9};
        System.out.println(solution.VerifySquenceOfBST(array));
    }
}