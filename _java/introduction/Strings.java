package _java.introduction;

public class Strings {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);

        // String concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // String length
        String str = "Hello, World!";
        int len = str.length();
        System.out.println("Length of the string: " + len);

        // String toUpperCase
        String txt = "Hello, World!";
        String upperCase = txt.toUpperCase();
        System.out.println(upperCase);

        // String toLowerCase
        String txt2 = "Hello, World!";
        String lowerCase = txt2.toLowerCase();
        System.out.println(lowerCase);

        // String replace
        String txt3 = "Hello, World!";
        String replaced = txt3.replace("World", "Java");
        System.out.println(replaced);

        // String trim
        String txt4 = "   Hello, World!   ";
        String trimmed = txt4.trim();
        System.out.println(trimmed);

        // String substring
        String txt5 = "Hello, World!";
        String subStr = txt5.substring(7);
        System.out.println(subStr);

        // String split
        String txt6 = "Hello, World!";
        String[] splitStr = txt6.split(",");
        System.out.println(splitStr[0]);
        System.out.println(splitStr[1]);

        // String indexOf
        String txt7 = "Hello, World!";
        int index = txt7.indexOf("World");
        System.out.println(index);

        // String charAt
        String txt8 = "Hello, World!";
        char ch = txt8.charAt(0);
        System.out.println(ch);

        // String equals
        String txt9 = "Hello, World!";
        String txt10 = "Hello, World!";
        boolean isEqual = txt9.equals(txt10);
        System.out.println(isEqual);

        // String equalsIgnoreCase
        String txt11 = "Hello, World!";
        String txt12 = "hello, world!";
        boolean isEqual2 = txt11.equalsIgnoreCase(txt12);
        System.out.println(isEqual2);

        // String startsWith
        String txt13 = "Hello, World!";
        boolean startsWith = txt13.startsWith("Hello");
        System.out.println(startsWith);

        // String endsWith
        String txt14 = "Hello, World!";
        boolean endsWith = txt14.endsWith("World!");
        System.out.println(endsWith);

        // String toCharArray
        String txt15 = "Hello";
        char[] charArray = txt15.toCharArray();
        System.out.println(charArray[0]);
        System.out.println(charArray[1]);
        System.out.println(charArray[2]);
        System.out.println(charArray[3]);
        System.out.println(charArray[4]);

        // String valueOf
        int number = 10;
        String str2 = String.valueOf(number);
        System.out.println(str2);

        // String format
        String str3 = "Hello";
        String formatted = String.format("This is %s", str3);
        System.out.println(formatted);

        // Strings - Special Characters
        String txt16 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt16);

        // \n - New Line
        // \r - Carriage Return
        // \t - Tab
        // \b - Backspace
        // \f - Form Feed
        // \\ - Backslash
        // \' - Single Quote
        // \" - Double Quote
    }
}
