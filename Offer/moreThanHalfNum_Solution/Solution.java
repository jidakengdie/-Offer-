package moreThanHalfNum_Solution;

public class Solution {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array.length == 0 && array == null) {
            return -1;
        }
        int times = 1, counts = 0;
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (times == 0) {
                result = array[i];
                times++;
            }
            if (result == array[i]) {
                times++;
            } else {
                times--;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (result == array[i]) {
                counts++;
            }
        }
        if (counts > array.length / 2) {
            return result;
        }
        return 0;
    }
}