/*
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"
示例 2:

输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
说明:

所有输入只包含小写字母 a-z 。
*/
//思路：对第一个字符串进行选取，位数逐渐增加，再判断其他的字符是否也是该几位字符开头的。
//注意：空字符串数组，判断其他的字符时注意越界问题。
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String result = "";
        if(strs.length == 0)
            return result;
        String testresult = "";
        boolean IsAllFirst = true;
        for(int i = 0;i < strs[0].length();i++){
            testresult = strs[0].substring(0,i+1);
            for(int j = 0;j < strs.length;j++){
                if(strs[j].length() < i+1)
                {
                    IsAllFirst = false;
                    break;
                }
                if(!strs[j].substring(0,i+1).equals(testresult)){
                    IsAllFirst = false;
                }
            }
            if(IsAllFirst){
                result = testresult;
            }
            else{
                break;
            }
        }
        return result;
    }
}
