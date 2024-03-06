import java.util.HashMap;

public class Solution {

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();

        for (String s : keymap) {
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                int loc = map.getOrDefault(c, -1);

                if (loc == -1 || loc > j) {
                    map.put(c, j + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int result = 0;

            for (int j = 0; j < target.length(); j++) {
                char minTarget = target.charAt(j);
                int rc = map.getOrDefault(minTarget, -1);

                if (rc == -1) {
                    result = -1;
                    break;
                } else {
                    result += rc;
                } 
            }

            answer[i] = result;
        }
        return answer;
    }
}
