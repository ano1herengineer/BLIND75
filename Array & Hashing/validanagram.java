//242. Valid Anagram
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//Leetcode Blind 75: https://leetcode.com/problems/valid-anagram/

//An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

//Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true
 
//Example 2:   
//Input: s = "rat", t = "car"
//Output: false

//Constraints:
//1 <= s.length, t.length <= 5 * 104
//s and t consist of lowercase English letters.
 class validanagram 
 {
    public boolean isAnagram(String s, String t)
    {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);
    }

    public static void main(String[] args)
    {
        System.out.prinln("enter string s");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.prinln("enter string t");
        String t = sc.nextLine();
        validanagram obj = new validanagram();// creting object of class validanagram to call isAnagram method 
        boolean result = obj.isAnagram(s,t);
        System.out.prinln("result is " + result);
    }
 }