package org.mg.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 11) How to find all permutations of String? (solution)
 * I have seen this String interview question on many interviews. It has a easy recursive solution but thinks get
 * really tricky when Interviewer ask you to solve this question without using recursion. You can use Stack though.
 * Write a program to print all permutations of a String in Java, for example if input is "xyz" then it should print
 * "xyz", "yzx", "zxy", "xzy", "yxz", "zyx".
 */
public class Q11Permutations {
    public List<String> permutations(String s) {
        if (s==null) return null;
        List<String> result = new ArrayList<>();
        if (s.length() < 2){

            result.add(s);
            return result;
        }

        List<String> permutations = permutations(s.substring(1));
        for (String permutation : permutations){
            for (int i=0;i<=permutation.length();i++){
                String newPermutation = permutation.substring(0, i) + s.charAt(0)+ permutation.substring(i);
                result.add(newPermutation);
            }
        }
        return result;
    }

//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            List<String> permutations = permutations(s.substring(0, i) + s.substring(i+1));
//            for (String permutation : permutations){
//                result.add(ch+permutation);
//            }
//        }

    public static void main(String[] args){
        Q11Permutations permuter = new Q11Permutations();
        List<String> perms = permuter.permutations("xyz");
        System.out.println(Arrays.toString(perms.toArray()));
    }
}
