package org.mg.interview;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1) How to Print duplicate characters from String? (solution)
 * To start with, we have a simple String related coding question frequently asked in programming interviews. You
 * need to write a program in C, C++, Java or Python to print duplicate characters from a given String, for example
 * if String is "Java" then program should print "a". Bonus points if your program is robust and handle different
 * kinds of input e.g. String without duplicate, null or empty String etc. Bonus points if you also write unit tests
 * for normal and edge cases.
 */
public class Q1DuplicateCharacters {

    public char[] duplicateCharacters(String s){
        if (s==null || s.length() ==0){
            return new char[]{};
        }

        Map<Character, List<Integer>> character2countMap = new HashMap<>();

        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (character2countMap.containsKey(c)){
                character2countMap.get(c).add(i);
            }else{
                List<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                character2countMap.put(c, indexes);
            }
        }

        Character[] duplicates = character2countMap.entrySet().stream()
                .filter(e -> e.getValue().size() > 1)
                .sorted((e1, e2) -> Integer.compare(e1.getValue().get(0), e2.getValue().get(0)))
                .map(e -> e.getKey())
                .toArray(Character[]::new);
        return ArrayUtils.toPrimitive(duplicates);
    }

    @Test
    public void testAccuracy(){
        Q1DuplicateCharacters dc = new Q1DuplicateCharacters();
        Assert.assertArrayEquals(new char[]{'a'}, dc.duplicateCharacters("Java"));
        Assert.assertArrayEquals(new char[]{'e'}, dc.duplicateCharacters("abecedar"));
        Assert.assertArrayEquals(new char[]{}, dc.duplicateCharacters("Abc"));
        Assert.assertArrayEquals(new char[]{'l', 'e'}, dc.duplicateCharacters("adler olsen"));
    }

    @Test
    public void testFailure(){
        Q1DuplicateCharacters dc = new Q1DuplicateCharacters();
        Assert.assertArrayEquals(new char[]{}, dc.duplicateCharacters(null));
        Assert.assertArrayEquals(new char[]{}, dc.duplicateCharacters(""));
    }
}
