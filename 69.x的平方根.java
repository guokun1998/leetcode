/*
实现 int sqrt(int x) 函数。

计算并返回 x 的平方根，其中 x 是非负整数。

由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。

示例 1:

输入: 4
输出: 2
示例 2:

输入: 8
输出: 2
说明: 8 的平方根是 2.82842..., 
     由于返回类型是整数，小数部分将被舍去。
*/
//思路从小到大乘，小于保留，大于返回，注意2^31极值。
class Solution {
    public int mySqrt(int x) {
        int before = 0;
        for(int i =0;i <= x;i++){
            if(i <= 46340 && i*i <= x){
                before = i;
            }
            else{
                return before;
            }
        }
        return before;
    }
}
