package practice.pg_12947;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        String number = String.valueOf(x);
        String[] arr = number.split("");
        int sum = 0;

        for (String s : arr) {
            sum += Integer.parseInt(s);
        }

        if (x % sum != 0) answer = false;

        return answer;
    }
}
