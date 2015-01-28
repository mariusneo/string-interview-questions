package org.mg.interview;

import junit.framework.Assert;
import org.junit.Test;

/**
 * 5) How to check if a String contains only digits?  (solution)
 * You need to write a program to check a String contains only numbers by using Regular expression in Java. You can
 * use Java API but a solution without using Java API will be better because that is what interviewer can always ask.
 */
public class Q5CheckForDigits {
    public boolean containsOnlyDigits(String s){
        if (s==null) return false;
        return s.matches("^[0-9]*$");
    }


    @Test
    public void testAccuracy(){
        Q5CheckForDigits checker = new Q5CheckForDigits();
        Assert.assertTrue(checker.containsOnlyDigits("1234"));
        Assert.assertTrue(checker.containsOnlyDigits("12341177"));
        Assert.assertFalse(checker.containsOnlyDigits("123431d1"));
        Assert.assertFalse(checker.containsOnlyDigits("abcd"));
        Assert.assertFalse(checker.containsOnlyDigits("123\n123"));
    }
}
