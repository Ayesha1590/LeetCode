package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LongestCommonPrefix {

    public static String Solution(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            log.info("strs[i] : {}", strs[i]);
            while (strs[i].indexOf(prefix) != 0) {
                log.info("strs[i].indexOf(prefix) : {}, prefix : {}",strs[i].indexOf(prefix) , prefix);
                prefix = prefix.substring(0, prefix.length() - 1);
                log.info("prefix11 : {}", prefix);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        log.info("Result : {}", Solution(strs));
    }
}
