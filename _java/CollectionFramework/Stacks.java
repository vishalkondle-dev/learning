package _java.CollectionFramework;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Stack: " + stack);
        System.out.println("Search: " + stack.search("B"));
        System.out.println("Empty: " + stack.empty());
        System.out.println("Size: " + stack.size());
    }
}
