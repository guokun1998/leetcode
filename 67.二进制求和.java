/*
给定两个二进制字符串，返回他们的和（用二进制表示）。

输入为非空字符串且只包含数字 1 和 0。

示例 1:

输入: a = "11", b = "1"
输出: "100"
示例 2:

输入: a = "1010", b = "1011"
输出: "10101"
*/
class Solution {
    public String addBinary(String a, String b) {
        String jinwei = "0";
        String result = "";
        String aa;
        String bb;
        int numa = a.length();
        int numb = b.length();
        for(int i = 0;i < Math.max(a.length(),b.length()) ;i++){
            if(numa > 0){
                aa = a.substring(numa-1,numa);
            }
            else{
                aa = "";
            }
            if(numb > 0){
                bb = b.substring(numb-1,numb); 
            }
            else{
                bb = "";
            }
            if(aa.equals("") && jinwei.equals("0")){
                result = bb + result;
                jinwei = "0";
            }
            else if(aa.equals("") && jinwei.equals("1") &&bb.equals("0")){
                
                result = "1" + result;
                jinwei = "0";
            }
            else if(aa.equals("") && jinwei.equals("1") &&bb.equals("1")){
                result = "0" + result;
                jinwei = "1";
                
            }
            else if(bb.equals("") && jinwei.equals("0")){
                result = aa + result;
                jinwei = "0";
            }
            else if(bb.equals("") && jinwei.equals("1") && aa.equals("0")){
                result = "1" + result;
                jinwei = "0";
            }
            else if(bb.equals("") && jinwei.equals("1") && aa.equals("1")){
                result = "0" + result;
                jinwei = "1";
            }
            else if(aa.equals("1") && bb.equals("1") && jinwei.equals("0")){
                result = "0" + result;
                jinwei = "1";
            }
            else if(aa.equals("1") && bb.equals("1") && jinwei.equals("1")){
                result = "1" + result;
                jinwei = "1";
            }
            else if(aa.equals("1") && bb.equals("0") && jinwei.equals("1")){
                result = "0" + result;
                jinwei = "1";
            }
            else if(aa.equals("1") && bb.equals("0") && jinwei.equals("0")){
                result = "1" + result;
                jinwei = "0";
            }
            else if(aa.equals("0") && bb.equals("1") && jinwei.equals("1")){
                result = "0" + result;
                jinwei = "1";
            }
            else if(aa.equals("0") && bb.equals("1") && jinwei.equals("0")){
                //System.out.println("!!!");
                result = "1" + result;
                jinwei = "0";
            }
            else if(aa.equals("0") && bb.equals("0") && jinwei.equals("1")){
                result = "1" + result;
                jinwei = "0";
            }
            else if(aa.equals("0") && bb.equals("0") && jinwei.equals("0")){
                result = "0" + result;
                jinwei = "0";
            }
            numa--;
            numb--;
            
            
        }
        if(jinwei.equals("1"))
            result = "1" + result;
        return result;
    }
}
