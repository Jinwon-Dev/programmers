package practice.pg_12915;

import java.util.Arrays;

public class Solution {

    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (o1, o2) -> {
            if (o1.charAt(n) > o2.charAt(n)) return 1;
            else if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
            else if (o1.charAt(n) < o2.charAt(n)) return -1;
            else return 0;
        });

        return strings;
    }
}
