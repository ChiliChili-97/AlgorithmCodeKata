import java.util.Arrays;

public class Solution {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여분 체육복이 없을 때 가능한 인원 수
        int availableNum = n - lost.length;

        // 여벌의 체육복을 가진 학생이 도난당하면 빌려줄 수 없음
        int reverseLost = 0;
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    lost[j] = -1;
                    reserve[i] = -1;
                    reverseLost++;
                    break;
                }
            }
        }

        // 빌릴 수 있는 학생 수
        int borrowNum = 0;
        for (int i : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (i == -1 || reserve[j] == -1) {
                    continue;
                }
                if (i == reserve[j] - 1 || i == reserve[j] + 1) {
                    reserve[j] = -1;
                    borrowNum++;
                    break;
                }
            }
        }
        answer = availableNum + reverseLost + borrowNum;
        return answer;
    }
}
