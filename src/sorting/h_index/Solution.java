package sorting.h_index;

import java.util.Arrays;

public class Solution {

    public int solution(int[] citations) {

        int answer = 0;

        Arrays.sort(citations); // 01356

        // MEMO: 인용된 횟수와 논문 수가 일치하는 최대값 구하기
        for (int i = 0; i < citations.length; i++) {
            int tmp = citations.length - i;

            if (citations[i] >= tmp) { // 하나씩 줄여가면서 자신보다 작은 수(논문 개수)중
                answer = tmp;          // 자신 = 논문 개수면 최댓값!
                break;
            }
        }

        return answer;
    }
}
