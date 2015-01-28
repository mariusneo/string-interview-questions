package org.mg.interview;

import junit.framework.Assert;
import org.junit.Test;

/**
 * 10) How to replace each given character to other e.g. blank with %20? (solution)
 * Write a Java program to replace a given character in a String to other provided character, for example if you are
 * asked to replace each blank in a String with %20, similar to URL encoding done by browser, so that Server can read
 * all request parameters. For example if input is "Java is Great" and asked to replace space with %20 then it should
 * be "Java%20is%20Great".
 */
public class Q10ReplaceCharacter {
    public String replaceChar(String s, char c){
        if (s==null || s.length()==0) return s;

        StringBuilder sb = new StringBuilder();
        int previousIndex =-1;
        int index;
        while ((index =s.indexOf(c, previousIndex+1)) != -1){
            sb.append(s.substring(previousIndex+1, index)).append("%20");
            previousIndex = index;
        }
        if (previousIndex < s.length() -1 )
        sb.append(s.substring(previousIndex+1));
        return sb.toString();
    }

    @Test
    public void testAccuracy(){
        Q10ReplaceCharacter replacer = new Q10ReplaceCharacter();
        Assert.assertEquals("Java%20is%20Great", replacer.replaceChar("Java is Great", ' '));
        Assert.assertEquals("Java%20%20Great", replacer.replaceChar("Java  Great", ' '));
        Assert.assertEquals("Java%20%20", replacer.replaceChar("Java  ", ' '));
        Assert.assertEquals("%20%20Java", replacer.replaceChar("  Java", ' '));
        Assert.assertEquals("Java", replacer.replaceChar("Java", ' '));
    }
}
