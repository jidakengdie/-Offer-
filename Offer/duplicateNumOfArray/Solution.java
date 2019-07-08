package duplicateNumOfArray;

import java.util.HashSet;

public class Solution {
    // Parameters:
    // numbers: an array of integers
    // length: the length of array numbers
    // duplication: (Output) the duplicated number in the array number,length of
    // duplication array is 1,so using duplication[0] = ? in implementation;
    // Here duplication like pointor in C/C++, duplication[0] equal *duplication in
    // C/C++
    // 这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value: true if the input is valid, and there are some duplications in
    // the array number
    // otherwise false

    // 哈希法1：
    // public boolean duplicate(int numbers[], int length, int[] duplication) {
    //     if (numbers.length == 0 || length == 0 || duplication.length == 0)
    //         return false;
    //     boolean[] bool = new boolean[length];
    //     int flag = 1;
    //     for(int i=0;i<length;i++){
    //         if(bool[numbers[i]] == true){
    //             flag = 0;
    //             duplication[0] = numbers[i];
    //             break;
    //         }
    //         bool[numbers[i]] = true;
    //     }
    //     return flag == 1 ? false : true;
    // }

    //哈希法2：
    public boolean duplicate(int numbers[], int length, int[] duplication) {
            if (numbers.length == 0 || length == 0 || duplication.length == 0)
                return false;
            HashSet<Integer> hashSet = new HashSet<Integer>(length);
            for(int i=0;i<length;i++){
                if(!hashSet.add(numbers[i])){
                    duplication[0] = numbers[i];
                    return true;
                }
                // hashSet.add(numbers[i]);
            }
            return false;
        }
}