package practice.pg_12935;

class Solution {

    public int[] solution(int[] arr) {

        if (arr.length == 1) return new int[]{-1};

        int[] answer = new int[arr.length - 1];

        // MEMO: 최소값 구하기
        int min = arr[0];
        for (int i : arr) {
            min = Math.min(min, i);
        }

        // MEMO: 최소값을 제거한 배열 만들기
        int index = 0;
        for (int i : arr) {

            if (i == min) continue;
            answer[index++] = i;
        }

        return answer;
    }
}
