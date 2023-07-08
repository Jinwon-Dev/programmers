package monthly_code_challenge_season1.pg_70129;

public class Solution {

    public int[] solution(String s) {

        int[] answer = new int[2];
        int count = 0;
        int zeroCount = 0;

        while (!s.equals("1")) {
            int zero = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zero++;
                    zeroCount++;
                }
            }

            s = Integer.toBinaryString(s.length() - zero);
            count++;
        }

        answer[0] = count;
        answer[1] = zeroCount;
        return answer;
    }
}
