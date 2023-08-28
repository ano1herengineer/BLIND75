//217.Contains Duplicate
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Leetcode Blind 75:  https://leetcode.com/problems/contains-duplicate/
 

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true
 

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109

 class containsduplicate {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for(int i =0; i < n-1; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(nums[i] == nums[j])
                  return true;
            }
         }
        return false;     
    }
}