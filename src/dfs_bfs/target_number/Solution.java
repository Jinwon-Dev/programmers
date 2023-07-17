package dfs_bfs.target_number;

public class Solution {

    int[] numbers;
    int target;
    int answer;

    public int solution(int[] numbers, int target) {

        answer = 0;
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);

        return answer;
    }

    private void dfs(int depth, int sum) {

        // MEMO: 줄기의 마지막까지 탐색한 경우
        if (depth == numbers.length) {
            if (sum == target) answer++;
            return;
        }

        // MEMO: 각 숫자마다 +, -인 경우 둘 다 탐색
        dfs(depth + 1, sum + numbers[depth]);
        dfs(depth + 1, sum - numbers[depth]);
    }
}
