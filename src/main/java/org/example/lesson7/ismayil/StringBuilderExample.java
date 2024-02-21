package org.example.lesson7.ismayil;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append(): Concatenate a string at the end
        sb.append(" World");
        System.out.println("1. append(): " + sb);

        // 2. insert(): Insert a string at a specific position
        sb.insert(5, " Java");
        System.out.println("2. insert(): " + sb);

        // 3. delete(): Remove characters from a specific range
        sb.delete(5, 10);
        System.out.println("3. delete(): " + sb);

        // 4. deleteCharAt(): Remove a character at a specific position
        sb.deleteCharAt(5);
        System.out.println("4. deleteCharAt(): " + sb);

        // 5. reverse(): Reverse the content of StringBuilder
        sb.reverse();
        System.out.println("5. reverse(): " + sb);

        // 6. length(): Get the length of StringBuilder
        int length = sb.length();
        System.out.println("6. length(): " + length);

        // 7. toString(): Convert StringBuilder to String
        String resultString = sb.toString();
        System.out.println("7. toString(): " + resultString);

        // 8. charAt(): Get a character at a specific position
        char charAtIndex = sb.charAt(0);
        System.out.println("8. charAt(0): " + charAtIndex);

        // 9. setCharAt(): Set a character at a specific position
        sb.setCharAt(0, 'X');
        System.out.println("9. setCharAt(0): " + sb);

        // 10. indexOf(): Find the index of a substring
        int indexOfJava = sb.indexOf("Java");
        System.out.println("10. indexOf(\"Java\"): " + indexOfJava);
    }
}
