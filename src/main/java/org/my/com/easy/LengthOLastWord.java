package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LengthOLastWord {

    public static int lengthOfLastWord(String s) {
        int length = 0;
//        int i = s.length() - 1;
//
//        while (i >= 0 && s.charAt(i) == ' ') {
//            i--;
//        }
//
//        while (i >= 0 && s.charAt(i) != ' ') {
//            length++;
//            i--;
//        }
        String[] split = s.split(" ");
        if (split.length > 0) {
            length = split[split.length - 1].length();
        }

        return length;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        log.info("Result : {}", lengthOfLastWord(s));
        log.info("Result : {}", lengthOfLastWord("   fly me   to   the moon  "));
        log.info("Result : {}", lengthOfLastWord("luffy is still joyboy"));
    }
}
