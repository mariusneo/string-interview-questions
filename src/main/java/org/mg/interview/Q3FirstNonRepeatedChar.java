package org.mg.interview;

import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 3) How to program to print first non repeated character from String? (solution)
 * One of the most common string interview questions: Find the first non-repeated (unique) character in a given
 * string. for Example if given String is "Morning" then it should print "M". This question demonstrates efficient
 * use of Hashtable. We scan the string from left to right counting the number occurrences of each character in a
 * Hashtable. Then we perform a second pass and check the counts of every character. Whenever we hit a count of 1 we
 * return that character, that’s the first unique letter. Be prepared for follow-up question for improving memory
 * efficiency, solving it without hash table as well.
 */
public class Q3FirstNonRepeatedChar {
    public Character firstNonRepeatedChar(String s){
        if (s==null || s.length()==0) return null;

        Set<Character> uniques = new LinkedHashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (!duplicates.contains(ch)){
                if (uniques.contains(ch)){
                    uniques.remove(ch);
                    duplicates.add(ch);
                }else{
                    uniques.add(ch);
                }
            }
        }
        if (uniques.isEmpty()) return null;
        return uniques.iterator().next();
    }

    @Test
    public void testAccuracy(){
        Q3FirstNonRepeatedChar fnrc = new Q3FirstNonRepeatedChar();
        Assert.assertTrue('M' == fnrc.firstNonRepeatedChar("Morning"));
        Assert.assertTrue('i'==fnrc.firstNonRepeatedChar("Miss March"));
        Assert.assertNull(fnrc.firstNonRepeatedChar("MMAABAB"));
    }
}
