package findNumbersWithSum;

import java.util.ArrayList;

public class Solution {
    // public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     if (array.length <= 0) {
    //         return list;
    //     }
    //     for (int i = 0, j = array.length - 1; i < j;) {
    //         if (array[i] + array[j] == sum) {
    //             if (list.isEmpty() || list.get(2) > array[i] * array[j]) {
    //                 list.clear();
    //                 list.add(array[i]);
    //                 list.add(array[j]);
    //                 list.add(array[i] * array[j]);
    //             }
    //         }
    //         if (array[i] + array[j] > sum) {
    //             j--;
    //         } else {
    //             i++;
    //         }
    //     }
    //     if(!list.isEmpty()){
    //         list.remove(2);
    //     }
    //     return list;
    // }
    //乘积最小肯定是i、j离得最远，所以直接返回
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (array == null || array.length < 2) {
            return list;
        }
        int i=0,j=array.length-1;
        while(i<j){
            if(array[i]+array[j]==sum){
            list.add(array[i]);
            list.add(array[j]);
                return list;
           }else if(array[i]+array[j]>sum){
                j--;
            }else{
                i++;
            }
             
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 7, 11, 15 };
        Solution solution = new Solution();
        solution.FindNumbersWithSum(array, 15);
    }
}