/*
给定一个 32 位有符号整数，将整数中的数字进行反转。

示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21
注意:

假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。

*/
class Solution {
    public int reverse(int x) {
        boolean AboveZero = false;
        if(x == 0)
            return 0;
        if(x > 0) AboveZero = true;
        else
            x = -x;
        int result = 0;
        int num = 1000000000;
        int y = 1;
        while(x / num == 0){
            num /= 10;
        }
        while(x != 0){
            if(x / num > 2 && y == 1000000000)//如果x / num * y溢出
                return 0;
            if(y == 1000000000 && result + x / num * y < result || result + x / num * y < x / num * y)
                return 0;//在最大数相乘时可能溢出，若溢出则结果必小于加数之一。
            result += x / num * y;
            y *= 10;
            x -= x / num * num;
            num /= 10;
        }
        if(AboveZero)
            return result;
        return -result;
    }
}
