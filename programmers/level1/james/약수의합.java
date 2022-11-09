package level1.james;

/**
 * 약수 합을 구하는 문제에서 발생하는 예외
 * 1) n이 1일 경우
 * 2) 제곱수
 */
public class 약수의합 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                answer += i;
                if(i != Math.sqrt(n)) {
                    int anotherValue = n / i;
                    answer += anotherValue;
                }
            }
        }
        return answer;
    }
}
