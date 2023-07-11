package summer_winter_coding_2018.pg_12980;

public class Solution {

    public int solution(int n) {

        int answer = 0;

        while (n != 0) {
            if (n % 2 == 0) n /= 2; // 순간이동
            else {
                n -= 1; // 건전지를 사용하는 점프
                answer++;
            }
        }

        return answer;
    }
}
