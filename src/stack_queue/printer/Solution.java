package stack_queue.printer;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public class Print {
        private int priority;
        private int location;

        public Print(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Print> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++)
            queue.add(new Print(priorities[i], i)); // -> (2,0), (1,1), (3,2), (2,3)

        while (!queue.isEmpty()) {
            Print print = queue.poll();

            boolean ifUpperPriorityExist = false;

            for (Print tmp : queue) {
                if (print.priority < tmp.priority) {
                    ifUpperPriorityExist = true;
                    break;
                }
            }

            if (ifUpperPriorityExist) queue.add(print);
            else {
                answer++;
                if (print.location == location) break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};

        Solution solution = new Solution();
        System.out.println(solution.solution(priorities, 0));
    }
}