package practice.pg_154539;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    public int[] solution(int[] numbers) {

        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        // MEMO: 배열의 초기값을 -1로 세팅 -> 자신보다 큰 수가 없거나 마지막 인덱스인 경우
        Arrays.fill(answer, -1);

        for (int i = 0; i < numbers.length; i++) {

            // MEMO: 스택의 최상단과 현재 인덱스를 비교
            while (!stack.empty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }

            stack.push(i);
        }

        return answer;
    }
}
