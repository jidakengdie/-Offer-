package reOrderArray;

class Solution {
    public void reOrderArray(int[] array) {
        if (array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }

    // public static void main(String[] args) {
    //     Solution solution = new Solution();
    //     int[] array = { 2,4,6,1,3,5,7 };
    //     solution.reOrderArray(array);
    // }
}