/*
给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。

最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。

示例 1:

输入: [9,9,9]
输出: [1,0,0,0]
解释: 输入数组表示数字 999。
示例 2:

输入: [4,3,2,1]
输出: [4,3,2,2]
解释: 输入数组表示数字 4321。
*/
//思路：从后向前逐位加，判断进位；
class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length+1];
        int jinwei = 1;
        for(int i=digits.length-1;i>=0;i--){
            //System.out.println(digits[i]);
            if (digits[i]+jinwei > 9){
                result[i+1] = (digits[i] + jinwei)%10;
                jinwei = 1;
            }
            else{
                result[i+1]=digits[i]+jinwei;
                jinwei = 0;
            }
        }
        result[0] = jinwei;
        
        if(result[0]==0){
            int[] trueResult = new int[result.length-1];
            for(int i =0;i < trueResult.length;i++){
                trueResult[i] = result[i+1];
            }
            return trueResult;
        }
        return result;
    }
}
