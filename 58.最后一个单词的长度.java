/*
给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

如果不存在最后一个单词，请返回 0 。

说明：一个单词是指由字母组成，但不包含任何空格的字符串。

示例:

输入: "Hello World"
输出: 5
"a  "
1
*/

//思路：倒叙查找第一个空格（没有单词只有空格不算）
class Solution {
    public int lengthOfLastWord(String s) {
        int num = 0;
        for(int i=s.length();i>0;i--){
            String a = s.substring(i-1,i);
            if(a.equals(" ") && num!=0){
                break;
            }
            else if(a.equals(" ") && num==0){}
            else{
                num++;
            }
        }
        return num;
    }
}
