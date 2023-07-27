package monthly_code_challenge_season2.pg_76501;

public class Solution {

    public int solution(int[] absolutes, boolean[] signs) {

        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {

            if (!signs[i]) absolutes[i] = -absolutes[i];
            answer += absolutes[i];
        }

        return answer;
    }
}
