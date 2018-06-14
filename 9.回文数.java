/*判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

示例 1:

输入: 121
输出: true
示例 2:

输入: -121
输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
示例 3:

输入: 10
输出: false
解释: 从右向左读, 为 01 。因此它不是一个回文数。
进阶:

你能不将整数转为字符串来解决这个问题吗？*/
//思路，利用第7题解决的反转整数问题来解决这个问题，若一个整数是回文数，则反转后仍是回文数。



class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int y = reverse(x);
        if(y == x)
            return true;
        return false;
    }
    static public int reverse(int x) {
        
        if(x == 0)
            return 0;
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
        return result;
    }
}
