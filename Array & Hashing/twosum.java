// 1. Two Sum 
// Easy
//Leetcode Blind 75: https://leetcode.com/problems/two-sum/

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]

// Constraints:
// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.

import java.util.Scanner;
class twosum 
{
    public int[] twoSum(int[] nums, int target)
    {
        int n = nums.length;
        int[] result = new int[2];
        for(int i=0; i<n-1; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String args[])
    {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elements of array");
        for(int i = 0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("enter the target");
        int target = sc.nextInt();
        twosum obj = new twosum();
        int[] result = obj.twoSum(nums,target);
        System.out.println("result is " + result[0]+","+result[1]);
    }
}