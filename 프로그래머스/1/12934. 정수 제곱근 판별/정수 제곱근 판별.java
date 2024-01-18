class Solution {
    public long solution(long n) {
        long answer = 0;
        for (long x = 1; x <= n / x; x++) {
            if (x * x == n) {
                answer = (x + 1) * (x + 1);
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}