package brute_force.min_rectangle;

public class Solution {

    public int solution(int[][] sizes) {

        int answer = 0;
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] card : sizes) {
            int w = Math.max(card[0], card[1]);
            int h = Math.min(card[0], card[1]);

            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }

        answer = maxWidth * maxHeight;

        return answer;
    }
}
