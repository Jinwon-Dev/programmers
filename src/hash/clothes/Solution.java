package hash.clothes;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(String[][] clothes) {

        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>(); // <의상 이름, 의상 종류>가 아닌 <의상 종류, 가짓 수>

        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) { // Map 반복문 돌릴 때 사용
            answer *= entry.getValue() + 1;
        }

        return answer - 1; // 아무것도 안 입는 경우
    }
}
