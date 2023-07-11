package practice.pg_138476;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public int solution(int k, int[] tangerine) {

        int answer = 0;
        Arrays.sort(tangerine);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            hashMap.put(tangerine[i], hashMap.getOrDefault(tangerine[i], 0) + 1);
        }

        ArrayList<Integer> keySet = new ArrayList<>(hashMap.keySet());
        keySet.sort((o1, o2) -> hashMap.get(o2) - (hashMap.get(o1)));

        for (int i : keySet) {
            k -= hashMap.get(i);
            answer++;

            if (k <= 0) return answer;
        }

        return answer;
    }
}
