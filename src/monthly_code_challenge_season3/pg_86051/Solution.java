package monthly_code_challenge_season3.pg_86051;

import java.util.Arrays;

public class Solution {

    public int solution(int[] numbers) {

        int sum = Arrays.stream(numbers).sum();
        return 45 - sum;
    }
}
