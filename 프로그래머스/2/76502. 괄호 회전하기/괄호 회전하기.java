import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class Solution {

    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            Stack<String> stack = new Stack<>();
            int cnt = i;
            
            for (int j = 0; j < s.length(); j++) {

                if (cnt >= s.length()) {
                    cnt = 0;
                }
                if ((s.charAt(cnt) == (')') || s.charAt(cnt) == ('}') || s.charAt(cnt) == (']')) && !stack.empty()) {
                    if (stack.peek().equals("(") && s.charAt(cnt) == (')')) {
                        stack.pop();
                    } else if (stack.peek().equals("{") && s.charAt(cnt) == ('}')) {
                        stack.pop();
                    } else if (stack.peek().equals("[") && s.charAt(cnt) == (']')) {
                        stack.pop();
                    }
                } else {
                    stack.add(String.valueOf(s.charAt(cnt)));
                }
                cnt++;

            }
            if (stack.empty()) {
                answer++;
            }
        }
        return answer;
    }
}

