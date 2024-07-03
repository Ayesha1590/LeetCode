package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IndexOf1stOccurenceString {
    public static int indexOf1stOccurence(String str, String x) {
        return str.indexOf(x);
    }

    public static void main(String[] args) {
        String str = "leetcode";
        String x = "leeto";
        log.info("Result : {}", indexOf1stOccurence(str, x));
    }
}
