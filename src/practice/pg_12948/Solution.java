package practice.pg_12948;

public class Solution {

    public String solution(String phone_number) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < phone_number.length(); i++) {

            if (i < phone_number.length() - 4) answer.append("*");
            else answer.append(phone_number.charAt(i));
        }

        // MEMO: 문자열 자르기 & 정규표현식 사용
//        String star = phone_number.substring(0, phone_number.length() - 4).replaceAll("[0-9]", "*");
//        String number = phone_number.substring(phone_number.length() - 4);
//
//        answer = star + number;

        return answer.toString();
    }
}
