package greedy.gym_clothes;

import java.util.Arrays;

public class Solution {

    public int solution(int n, int[] lost, int[] reserve) {

        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {

                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {

                if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer + (n - lost.length);
    }
}
