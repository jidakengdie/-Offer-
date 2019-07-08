package NPower;

class Solution {
    public double Power(double base, int expoent) {
        if (base == 0) {
            return 0;
        }
        if (expoent == 0) {
            return 1;
        }
        double result = 1;
        if(expoent > 0){
            while(expoent>0){
                expoent --;
                result*=base;
            }
        }else{
            while(expoent<0){
                expoent++;
                result*=base;
            }
            result = 1/result;
        }
        return result;
    }
}