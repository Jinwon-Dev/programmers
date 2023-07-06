package practice.pg_12951;

public class Solution {

    public String solution(String s) {

        String answer = "";
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {

                char a = arr[i].charAt(j);

                if (j == 0) a = Character.toUpperCase(a);
                else a = Character.toLowerCase(a);

                answer += a;
            }

            answer += ' ';
        }

        if (s.charAt(s.length() - 1) == ' ') {
            return answer;
        } else {
            return answer.trim();
        }
    }
}
