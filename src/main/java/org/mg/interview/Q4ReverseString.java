package org.mg.interview;

import org.junit.Assert;
import org.junit.Test;

/**
 * 4) How to reverse String in Java using Iteration and Recursion? (solution)
 * Your task is to write a program to reverse String in Java without using StringBuffer class. You also need to
 * provide both iterative and recursive algorithm for String reversal. You can use other String utility methods e.g.
 * charAt(), toCharArray() or substring() from java.lang.String class.
 */
public class Q4ReverseString {

    public String reverseIterative(String s) {
        if (s==null) return null;
        int len = s.length();
        char[] reversed = new char[len];
        for (int i=0;i<=s.length()/2;i++){
            reversed[i] = s.charAt(len-i-1);
            reversed[len -i -1] = s.charAt(i);
        }
        return new String(reversed);
    }

    public String reverseRecursive(String s){
        if (s==null) return null;
        if (s.length() == 1) return s;
        return s.charAt(s.length() -1) + reverseRecursive(s.substring(0, s.length() -1));
    }

    @Test
    public void testAccuracyIterative(){
        Q4ReverseString rev = new Q4ReverseString();
        Assert.assertEquals("abc", rev.reverseIterative("cba"));
        Assert.assertEquals("abcd", rev.reverseIterative("dcba"));

    }

    @Test
    public void testAccuracyRecursive(){
        Q4ReverseString rev = new Q4ReverseString();
        Assert.assertEquals("abc", rev.reverseRecursive("cba"));
        Assert.assertEquals("abcd", rev.reverseRecursive("dcba"));

    }
}
