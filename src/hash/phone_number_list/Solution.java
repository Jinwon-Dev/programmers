package hash.phone_number_list;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean solution(String[] phone_book) {

        boolean answer = true;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                // 자기 자신은 제외하고 잘라서 찾아주기
                if (map.containsKey(phone_book[i].substring(0, j))) return false; // 내가 접두어가 될 수 있나?가 아닌 내 접두어가 있나?를 찾아보는 과정
            }
        }

        return answer;
    }
}
