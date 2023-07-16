package sorting.k_number;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {

            int a = commands[i][0];
            int b = commands[i][1];

            int[] count = new int[b - a + 1];

            int index = 0;
            for (int j = a - 1; j < b; j++) {
                count[index] = array[j];
                index++;
            }

            Arrays.sort(count);
            answer[i] = count[commands[i][2] - 1];
        }

        return answer;
    }
}
