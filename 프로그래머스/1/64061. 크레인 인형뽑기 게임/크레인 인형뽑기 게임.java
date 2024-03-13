import java.util.Stack;

public class Solution {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int n = board[0].length;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            move--;
            for (int i = 0; i < n; i++) {
                if (board[i][move] != 0) {
                    if(!stack.isEmpty() && stack.peek() == board[i][move]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][move]);
                    }
                    board[i][move] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}

