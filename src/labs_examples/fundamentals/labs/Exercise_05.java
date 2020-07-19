package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

// please initialize a boolean variable and test whether str is equal to str2
public class Exercise_05 {

    public static void main(String[] args) {
        // please declare an int variable below, and set it to the value of the length of "str"
        String str = "hello!";
        String str2 = "hello";
        int i = 5;
        int length = "hello".length();
        System.out.println(length);

        // please initialize a boolean variable and test whether str is equal to str2
        boolean equals = "hello!".equals("hello");
        System.out.println(equals);
        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = "hello!" + "hello";
        System.out.println(str3);
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        int search = "hello!".indexOf("h");
        System.out.println(search);
    }

}
