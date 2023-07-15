package brute_force.fatigue;

public class Solution {

    private static boolean[] visited;
    private static int count = 0;

    public int solution(int k, int[][] dungeons) { // [[80,20],[50,40],[30,10]]

        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);

        return count;
    }

    private void dfs(int depth, int fatigue, int[][] dungeons) { // 현재까지 탐험한 던전 개수, 남은 피로도, 던전 배열

        for (int i = 0; i < dungeons.length; i++) {

            // MEMO: 이미 방문한 던전인 경우나 현재 피로도로 탐험할 수 없는 경우, 다음 던전으로 넘어감
            if (visited[i] || dungeons[i][0] > fatigue) {
                continue;
            }

            // MEMO: 현재 던전을 방문했다고 표시 후, 소모 피로도 만큼 현재 피로도 감소
            visited[i] = true;
            dfs(depth + 1, fatigue - dungeons[i][1], dungeons);
            visited[i] = false;
        }

        // MEMO: 모든 던전을 탐험한 후, 최대 탐험 던전 수를 갱신
        count = Math.max(count, depth);
    }
}
