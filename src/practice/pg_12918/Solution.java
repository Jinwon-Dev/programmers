package practice.pg_12918;

public class Solution {

    public boolean solution(String s) {

        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {

            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetter(s.charAt(i))) {
                    return false;
                }
            }
        } else return false;

        return answer;
    }
}
