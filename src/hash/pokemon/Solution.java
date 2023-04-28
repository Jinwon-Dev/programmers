package hash.pokemon;

import java.util.HashSet;

public class Solution {

    public static int solution(int[] nums) {

        int answer = 0;
        int number = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        if (number >= set.size()) {
            answer = set.size();
        } else {
            answer = number;
        }

        return answer;
    }
}
