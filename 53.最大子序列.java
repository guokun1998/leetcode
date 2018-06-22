/*
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
进阶:

如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
*/
//思路：如果加下一个数没有下一个数自身大，即自己是累赘的时候，重新从下一个数累加。
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar=nums[0], maxEndingHere=nums[0];
        for (int i=1;i<nums.length;++i){
            maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);	
        }
        return maxSoFar;
    }
}
