package org.mg.interview;

/**
 * 7) How to count number of vowels and consonants in a String? (solution)
 * One of easiest String question you will ever see. You have to write a Java program which will take a String input
 * and print out number of vowels and consonants on that String. For example if input is "Java" then your program
 * should print "2 vowels and 2 consonants". If you get this question on Interview, you should clarify that whether
 * String can contain numbers, special characters or not e.g. anything other than vowels and consonants.
 */
public class Q7VowelsAndConsonants {


    public  int[] vowelsAndConsonants(String s){
        if (s==null || s.length() ==0) return new int[]{0,0};
        int vowels=0, consonants =0;
        String VOWELS = "aeiouAEIOU";
        String CONSONANTS = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (Character.isLetter(ch)){
                if (VOWELS.indexOf(ch) == -1)consonants++;
                else vowels++;
            }
        }

        return new int[]{vowels, consonants};
    }
}
