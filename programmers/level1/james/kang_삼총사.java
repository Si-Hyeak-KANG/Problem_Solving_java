package level1.james;

import java.util.ArrayList;

public class kang_삼총사 {
    static int count = 0;
    public static void main(String[] args) {

        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(solution(number));

        count = 0;
        number = new int[]{-3, -2, -1, 0, 1, 2, 3};
        System.out.println(solution(number));

        count=0;
        number = new int[]{-1, 1, -1, 1};
        System.out.println(solution(number));
    }

    public static int solution(int[] number) {
        int answer = 0;

        func(0, number, new ArrayList<>());
        answer = count;
        return answer;
    }

    public static void func(int start, int[] number, ArrayList<Integer> threeArr) {

        if(threeArr.size() == 3) {
            if(threeArr.stream().mapToInt(a->a).sum() == 0) count++;
            threeArr.remove(threeArr.size()-1);
            return;
        }

        for(int i = start; i < number.length; i++) {
            threeArr.add(number[i]);
            func(i+1,number,threeArr);
        }

        if(threeArr.size() > 0) {
            threeArr.remove(threeArr.size() - 1);
        }
    }
}
