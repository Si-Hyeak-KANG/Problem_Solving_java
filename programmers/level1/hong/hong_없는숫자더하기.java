package level1.hong;

/** 프로그래머스 코딩테스트연습
 * 없는 숫자 더하기
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 */

public class hong_없는숫자더하기 {
        public int solution(int[] numbers) {
            int answer = 45;
            int base = 0;
            for(int i=0; i<numbers.length; i++){
                base += numbers[i];
            }

            answer = answer - base;

            return answer;
        }
}
