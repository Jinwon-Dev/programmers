package practice.pg_12941;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public int solution(int[] A, int[] B) {

        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
//        Integer[] arr = Arrays.stream(B).boxed().toArray(Integer[]::new);
//        Arrays.sort(arr, Collections.reverseOrder()); -> 효율성 시간 초과

        int num = B.length - 1;
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[num--];
        }

        return answer;
    }
}
