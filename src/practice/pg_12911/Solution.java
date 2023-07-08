package practice.pg_12911;

public class Solution {

    public int solution(int n) {

        int answer = 0;

        int bit = Integer.bitCount(n); // bitCount() = 이진수로 변환 후, 1의 개수를 반환
        int count = 0;

        while (true) {
            n++;
            count = Integer.bitCount(n);

            if (bit == count) {
                answer = n;
                break;
            }
        }

        return answer;
    }
}
