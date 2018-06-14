/*
罗马数字包含以下七种字符：I， V， X， L，C，D 和 M。

字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。

示例 1:

输入: "III"
输出: 3
示例 2:

输入: "IV"
输出: 4
示例 3:

输入: "IX"
输出: 9
示例 4:

输入: "LVIII"
输出: 58
解释: C = 100, L = 50, XXX = 30, III = 3.
示例 5:

输入: "MCMXCIV"
输出: 1994
解释: M = 1000, CM = 900, XC = 90, IV = 4.
*/
//思路：从前到后，如果不是只剩最后一个字母，一次读两个，判断是否符合特例，是，i+2，否判断符合哪个字母i+1
class Solution {
    public int romanToInt(String s) {
        int i = 0;
        int result = 0;
        while(i < s.length() ){
            String a;
            if(i == s.length() - 1){
                a = s.substring(i,i+1);
            }
            else{
                a = s.substring(i,i+2);
            }
            if(a.equals("IV")){
                result += 4;
                i += 2;
            }
            else if(a.equals("IX")){
                result += 9;
                i += 2;
            }
            else if(a.equals("XL")){
                result += 40;
                i += 2;
            }
            else if(a.equals("XC")){
                result += 90;
                i += 2;
            }
            else if(a.equals("CD")){
                result += 400;
                i += 2;
            }
            else if(a.equals("CM")){
                result += 900;
                i += 2;
            }
            else{
                String first = a.substring(0,1);    
                if(first.equals("I")){
                    result += 1;
                }
                else if(first.equals("V")){
                    result += 5;
                }
                else if(first.equals("X")){
                    result += 10;
                }
                else if(first.equals("L")){
                    result += 50;
                }
                else if(first.equals("C")){
                    result += 100;
                }
                else if(first.equals("D")){
                    result += 500;
                }
                else if(first.equals("M")){
                    result += 1000;    
                }
                i++;
            }
        }
        
        
        return result;
    }
}
