package practice.pg_12939;

import java.util.Arrays;

public class Solution {

    public String solution(String s) {

        String answer = "";
        String[] strArr = s.split(" ");
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(intArr);
        answer = intArr[0] + " " + intArr[intArr.length - 1];

        return answer;
    }
}
