package stack_queue.printer;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution2 {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int n : priorities)
            queue.add(n);

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;

                    if (location == i) return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};

        Solution2 solution = new Solution2();
        System.out.println(solution.solution(priorities, 2));
    }
}