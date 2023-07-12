package kakao_blind_recruitment_2018.pg_17680;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int solution(int cacheSize, String[] cities) {

        int answer = 0;
        Queue<String> queue = new LinkedList<>();

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (String city : cities) {

            city = city.toLowerCase();

            if (queue.contains(city)) { // cache hit
                queue.remove(city);
                queue.offer(city);
                answer++;
            } else { // cache miss

                if (queue.size() < cacheSize) {
                    queue.offer(city);
                } else {
                    queue.poll();
                    queue.offer(city);
                }

                answer += 5;
            }
        }

        return answer;
    }
}
