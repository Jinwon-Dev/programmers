package summer_winter_coding_2018.pg_12981;

import java.util.HashSet;

public class Solution {

    public int[] solution(int n, String[] words) {

        int[] answer = new int[2];

        HashSet<String> set = new HashSet<>();
        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {

            // 현재 index보다 1 작은 단어의 끝 알파벳과 현재 단어의 시작 알파벳을 비교
            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)
                    || set.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            } else {
                set.add(words[i]);
            }
        }

        return answer;
    }
}
