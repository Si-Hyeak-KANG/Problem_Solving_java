package level1;

import java.util.HashMap;

// 아스키코드 숫자 범위 : 48~57
public class kang_숫자문자열과영단어 {

    static HashMap<String, Integer> map = new HashMap<>();

    public void putNumberMap() {
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
    }

    public static void main(String[] args) {

        kang_숫자문자열과영단어 test = new kang_숫자문자열과영단어();
        test.putNumberMap();

        int result1 = test.solution("one4seveneight");
        System.out.println(result1);

        int result2 = test.solution("23four5six7");
        System.out.println(result2);

        int result3 = test.solution("2three45sixseven");
        System.out.println(result3);
    }

    public int solution(String s) {
        int answer = 0;
        String result = "";
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char currentWord = s.charAt(i);

            if (48 <= currentWord && currentWord <= 57) {
                result += currentWord;
            } else {
                temp += currentWord;
            }

            if (map.containsKey(temp)) {
                result += map.get(temp);
                temp = "";
            }
        }
        int resultByInt = Integer.parseInt(result);
        answer = resultByInt;

        return answer;
    }


}
