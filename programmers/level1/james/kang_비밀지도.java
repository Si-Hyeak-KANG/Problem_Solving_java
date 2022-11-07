package level1.james;

import java.util.ArrayList;
import java.util.List;

public class kang_비밀지도 {

    public static void main(String[] args) {
        kang_비밀지도 test = new kang_비밀지도();
        String[] result = test.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        for (String s : result) {
            System.out.println(s);
        }
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        List<String[]> arr1ToBinary = trans(arr1);
        List<String[]> arr2ToBinary = trans(arr2);

        for (int i = 0; i < n; i++) {
            String result = "";
            for (int j = 0; j < n; j++) {
                if (arr1ToBinary.get(i)[j].equals("1") || arr2ToBinary.get(i)[j].equals("1")) {
                    result += "#";
                } else {
                    result += " ";
                }
            }
            answer[i] = result;
        }

        return answer;
    }

    public List<String[]> trans(int[] arr) {
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String s = Integer.toBinaryString(arr[i]);
            if(s.length() != arr.length) {
                int n = arr.length - s.length();
                String zero = "";
                while(n-->0) {
                    zero += "0";
                }
                s = zero + s;
            }
            list.add(s.split(""));
        }
        return list;
    }
}
