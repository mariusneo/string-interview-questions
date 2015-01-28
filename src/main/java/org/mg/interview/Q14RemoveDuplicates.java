package org.mg.interview;

import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 14) How to remove duplicate characters from String? (solution)
 * This is one of the interesting String question, which also has lots of variants. You need to remove duplicate
 * characters from a given string keeping only the first occurrences. For example, if the input is ‘bananas’ the
 * output will be ‘bans’. Pay attention to what output could be, because if you look closely original order of
 * characters are retained in output. This is where many developer make mistake of shorting character array of String
 * and removing duplicates, similar to how you remove duplicates from array. That destroys original order of
 * characters and will not be correct solution in this case.
 */
public class Q14RemoveDuplicates {

    public String removeDuplicates(String s){
        if (s==null || s.length()==0) return s;
        StringBuilder builder= new StringBuilder();
        Set<Character> charSet = new HashSet<>();
        for (int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if (!charSet.contains(ch)){
                charSet.add(ch);
                builder.append(ch);
            }
        }
        return builder.toString();
    }

    @Test
    public void testAccuracy(){
        Q14RemoveDuplicates remover = new Q14RemoveDuplicates();
        Assert.assertEquals("bans", remover.removeDuplicates("bananas"));
    }
}
