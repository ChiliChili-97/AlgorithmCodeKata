#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    
    for(int i = 1; i <= n / 2; i++){ // 14일때 i <= 7
        if (n % i == 0){ // 1 2 
            answer += i;
        }
    }
    return answer + n;
}