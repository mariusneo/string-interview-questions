package org.mg.interview;

import junit.framework.Assert;
import org.junit.Test;

/**
 * 9) How to convert numeric String to int? (solution)
 * A classical coding interview question based upon String. You need to write a method like atoi() from C/C++, which
 * takes a numeric String and return its int equivalent. For example, if you pass "67263" to the program then it
 * should return 67263. Make sure your solution is robust i.e. it should be able to handle + and - character, null
 * and empty String, integer overflow and other corner cases. Bonus points if you come up with good unit test cases.
 * By the way, if your interviewer doesn't mention to you about atoi() then you can also use Java API's parseInt() or
 * valueOf() method to solve this problem.
 */
public class Q9StringToInt {

    public int toInt(String str){
        if (str == null || str.length() == 0) return 0;

        int firstDigitIndex =0;
        int sign =1;
        if (str.charAt(0)== '-'){
            sign=-1;
            firstDigitIndex =1;
        }else if (str.charAt(0) == '+'){
            sign = 1;
            firstDigitIndex =1;
        }
        int result = 0;
        int pow = 1;
        for (int i=str.length() -1 ; i>=firstDigitIndex;i--){
            char ch = str.charAt(i);
            if (!Character.isDigit(ch)){
                throw new IllegalArgumentException("Invalid argument : " + str);
            }
            int digit = Character.getNumericValue(ch);
            result +=pow*digit;
            pow*=10;
        }
        return result * sign;
    }

    @Test
    public void testAccuracy(){
        Q9StringToInt converter = new Q9StringToInt();
        Assert.assertEquals(123, converter.toInt("123"));
        Assert.assertEquals(123, converter.toInt("+123"));
        Assert.assertEquals(-123, converter.toInt("-123"));
        Assert.assertEquals(0, converter.toInt("0"));
    }
}
