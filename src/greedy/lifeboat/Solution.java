package greedy.lifeboat;

import java.util.Arrays;

public class Solution {

    public int solution(int[] people, int limit) {

        int answer = 0;

        Arrays.sort(people);
        int index = 0;

        for (int i = people.length - 1; i >= index; i--) { // 가장 가벼운 사람, 가장 무거운 사람을 비교
            if (people[i] + people[index] <= limit) { // 제한 무게보다 작으면,
                answer++;
                index++; // 보트를 태우고 인덱스를 증가시켜 마지막에서 두 번째, 처음에서 두 번째.. 이런식으로 증가시켜 비교
            } else answer++; // 제한 무게보다 크다면, 무거운 사람이 혼자 타야 하므로 제외하고 가벼운 사람과 두 번째로 무거운 사람을 비교
        }

        return answer;
    }
}
