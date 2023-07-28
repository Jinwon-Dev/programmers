package practice.pg_12930;

public class Solution {

    public String solution(String s) {

        // MEMO: 문자열 맨 뒤의 공백을 유지시켜주기 위해 limit 파라미터 사용
        String[] split = s.split(" ", -1);

        for (int i = 0; i < split.length; i++) {

            String[] str = split[i].split("");

            for (int j = 0; j < str.length; j++) {
                if (j % 2 == 0) str[j] = str[j].toUpperCase();
                else str[j] = str[j].toLowerCase();
            }

            split[i] = String.join("", str);
        }

        return String.join(" ", split);
    }
}
