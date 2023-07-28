package practice.pg_12916;

public class Solution {

    boolean solution(String s) {

        boolean answer = true;

        String str = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'p') pCount++;
            if (str.charAt(i) == 'y') yCount++;
        }

        if (pCount != yCount) answer = false;

        return answer;
    }
}
