package level1.hong;

/** 자릿수더하기
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 */
public class hong_자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        while(n>0) {
            answer += n%10;
            n = n/10;
        }
        return answer;
    }
}
