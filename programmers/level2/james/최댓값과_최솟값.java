package level2.james;

import java.util.Arrays;


public class 최댓값과_최솟값 {
    public String solution(String s) {

        String[] arr = s.split(" ");

        if (arr.length == 2) return s;

        int max = Arrays.stream(arr).mapToInt(m -> Integer.parseInt(m))
                .max().getAsInt();

        int min = Arrays.stream(arr).mapToInt(m -> Integer.parseInt(m))
                .min().getAsInt();

        return min + " " + max;
    }
}
