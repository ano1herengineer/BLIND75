//Leetcode Blind 75: https://leetcode.com/problems/group-anagrams/
//49. Group Anagrams
//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

//Example 1:
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

//Example 2:
//Input: strs = [""]
//Output: [[""]]

//Example 3:
//Input: strs = ["a"]
//Output: [["a"]]

//Constraints:
//1 <= strs.length <= 104
//0 <= strs[i].length <= 100
//strs[i] consists of lower-case English letters.

import java.util.*;
class groupanagrams
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted))
            {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());

    }
    
    public static void main(String[] args)
    {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        System.out.println("enter the elements of array");
        for(int i = 0; i<n; i++)
        {
            strs[i] = sc.nextLine();
        }
        groupanagrams obj = new groupanagrams();
        List<List<String>> result = obj.groupAnagrams(strs);
        System.out.println("result is " + result);
    }
}