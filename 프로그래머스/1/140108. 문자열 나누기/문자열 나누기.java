public class Solution {
    public int solution(String s) {
        int answer = 0;

        char c = s.charAt(0);
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (num ==0) {
                answer++;
                c = s.charAt(i);
            }
            if (c == s.charAt(i)) {
                num++;
            } else {
                num--;
            }
        }
        return answer;
    }

}

