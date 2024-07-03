package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class ValidParantheses {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] stack = new char[s.length()];
        int top = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[top++] = c;
            } else if (top == 0) {
                return false;
            } else if (c == ')' && stack[--top] != '(') {
                return false;
            } else if (c == '}' && stack[--top] != '{') {
                return false;
            } else if (c == ']' && stack[--top] != '[') {
                return false;
            }
        }
        return top == 0;
    }
    public static boolean isValid1(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
           log.info("c : {}", c);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                log.info("stack : {}", stack);
            } else {
                log.info("!stack : {}", stack);
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                log.info("top : {}", top);
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "(){)}";
        log.info("Result : {}", isValid1(s));
    }
}
