package org.my.com.medium;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LongestSubStringWithoutRepeatingChars {

    public static void main(String[] args) {
        String s = "abcabcbb";
        log.info("Result : {}", lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int[] index = new int[128];
        log.info("11index {}",index);
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            log.info("i : {}", i);
            ans = Math.max(ans, j - i + 1);
            log.info("ans : {}", ans);
            index[s.charAt(j)] = j + 1;
            log.info("index : {}", index);
        }
        return ans;
    }
}
