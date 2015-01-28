String Algorithms Interview Questions
========================================

This java project is used for solving the questions exposed on the webpage :

[http://javarevisited.blogspot.co.at/2015/01/top-20-string-coding-interview-question-programming-interview.html?m=1](http://javarevisited.blogspot.co.at/2015/01/top-20-string-coding-interview-question-programming-interview.html?m=1)



The content of the questions is copied from the website below :

 1) How to Print duplicate characters from String? (solution)
To start with, we have a simple String related coding question frequently asked in programming interviews. You need to write a program in C, C++, Java or Python to print duplicate characters from a given String, for example if String is "Java" then program should print "a". Bonus points if your program is robust and handle different kinds of input e.g. String without duplicate, null or empty String etc. Bonus points if you also write unit tests for normal and edge cases.


2) How to check if two Strings are anagrams of each other? (solution)
A simple coding problem based upon String, but could also be asked with numbers. You need to write a Java program to check if two given strings are anagrams of Each other. Two strings are anagrams if they are written using the same exact letters, ignoring space, punctuation and capitalization. Each letter should have the same count in both strings. For example, Army and Mary are anagram of each other.


3) How to program to print first non repeated character from String? (solution)
One of the most common string interview questions: Find the first non-repeated (unique) character in a given string. for Example if given String is "Morning" then it should print "M". This question demonstrates efficient use of Hashtable. We scan the string from left to right counting the number occurrences of each character in a Hashtable. Then we perform a second pass and check the counts of every character. Whenever we hit a count of 1 we return that character, that’s the first unique letter. Be prepared for follow-up question for improving memory efficiency, solving it without hash table as well.


4) How to reverse String in Java using Iteration and Recursion? (solution)
Your task is to write a program to reverse String in Java without using StringBuffer class. You also need to provide both iterative and recursive algorithm for String reversal. You can use other String utility methods e.g. charAt(), toCharArray() or substring() from java.lang.String class.


5) How to check if a String contains only digits?  (solution)
You need to write a program to check a String contains only numbers by using Regular expression in Java. You can use Java API but a solution without using Java API will be better because that is what interviewer can always ask.


6) How to find duplicate characters in a String? (solution)
You need to write a program to print all duplicate character and their count in Java. For example if given String is "Programming" then your program should print
g : 2
r : 2
m : 2


7) How to count number of vowels and consonants in a String? (solution)
One of easiest String question you will ever see. You have to write a Java program which will take a String input and print out number of vowels and consonants on that String. For example if input is "Java" then your program should print "2 vowels and 2 consonants". If you get this question on Interview, you should clarify that whether String can contain numbers, special characters or not e.g. anything other than vowels and consonants.


8) How to count occurrence of a given character in String? (solution)
If interviewer ask you to count occurrence of more than one character than you can either use an array, hash table or any additional data structure. In order to solve this problem, you are not allowed to do so. Your method must return count of given character, for example if input String is "Java" and given character is 'a' then it should return 2. Bonus point if you handle case, null and empty String and come up with unit tests.


9) How to convert numeric String to int? (solution)
A classical coding interview question based upon String. You need to write a method like atoi() from C/C++, which takes a numeric String and return its int equivalent. For example, if you pass "67263" to the program then it should return 67263. Make sure your solution is robust i.e. it should be able to handle + and - character, null and empty String, integer overflow and other corner cases. Bonus points if you come up with good unit test cases. By the way, if your interviewer doesn't mention to you about atoi() then you can also use Java API's parseInt() or valueOf() method to solve this problem.


10) How to replace each given character to other e.g. blank with %20? (solution)
Write a Java program to replace a given character in a String to other provided character, for example if you are asked to replace each blank in a String with %20, similar to URL encoding done by browser, so that Server can read all request parameters. For example if input is "Java is Great" and asked to replace space with %20 then it should be "Java%20is%20Great".


11) How to find all permutations of String? (solution)
I have seen this String interview question on many interviews. It has a easy recursive solution but thinks get really tricky when Interviewer ask you to solve this question without using recursion. You can use Stack though. Write a program to print all permutations of a String in Java, for example if input is "xyz" then it should print "xyz", "yzx", "zxy", "xzy", "yxz", "zyx".


12) How to reverse words in a sentence without using library method? (solution)
Write a function, which takes a String word and return sentence on which words are reversed in order e.g. if input is "Java is best programming language", output should be "language programming best is Java".


13) How to check if String is Palindrome?(solution)
Another easy coding question based upon String, I am sure you must have done this numerous time. Your program should return true if String is Palindrome, otherwise false. For example, if the input is "radar", the output should be true, if input is "madam" output will be true, and if input is "Java" output should be false.


14) How to remove duplicate characters from String? (solution)
This is one of the interesting String question, which also has lots of variants. You need to remove duplicate characters from a given string keeping only the first occurrences. For example, if the input is ‘bananas’ the output will be ‘bans’. Pay attention to what output could be, because if you look closely original order of characters are retained in output. This is where many developer make mistake of shorting character array of String and removing duplicates, similar to how you remove duplicates from array. That destroys original order of characters and will not be correct solution in this case.


15) How to check if a String is valid shuffle of two String? (solution)
One more difficult String algorithm based coding question for senior developers. You are given 3 strings: first,  second, and  third.  third String is said to be a shuffle of first and second if it can be formed by interleaving the characters of first and second String in a way that maintains the left to right ordering of the characters from each string. For example, given first = "abc" and second = "def",  third = "dabecf"  is a valid shuffle since it preserves the character ordering of the two strings. So, given these 3 strings write a function that detects whether third String is a valid shuffle of first and second String.


16) Write a program to check if a String contains another String e.g. indexOf()? (solution)
You need to write a function to search for the existence of a string (target) in another string (source). The function takes two strings as the input and returns the index where the second string is found. If the target string cannot be found, then return -1. If you are a Java developer, then you can related its behavior to indexOf() method from java.lang.String class. This question is also asked as Code and algorithm to check if a given short string is a substring of a main string. Can you get a linear solution (O(n)) if possible?


17) How  to return highest occurred character in a String? (solution)
You need to write a function to implement algorithm which will accept a string of characters and should find the highest occurrence of the character and display it. For example if input is "aaaaaaaaaaaaaaaaabbbbcddddeeeeee" it should return "a".


18) Write a program to remove a given characters from String? (solution)
One of my favorite coding question, when I interview Java developers. You need to write a Java method which will accept a String and a character to be removed and return a String, which doesn't has that character e.g remove(String word, char ch).  You need to provide both iterative and recursive solution of this method and also has to write JUnit tests to cover cases like null and empty String, input which only contains letter to be removed, String which doesn't contain given character etc.


19) Write a program to find longest palindrome in a string? (solution)
This is one of the tough coding question based upon String. It's hard to think about an algorithm to solve this problem until you have practiced good. What makes it more difficult is the constraint that your solution has O(n) time complexity and O(1) space complexity.


20) How to sort String on their length in Java? (solution)
Write a Program to sort String on their length in Java? Your method should accept  an array of String and return a sorted array based upon length of String. Don't forget to write unit tests for your solution.