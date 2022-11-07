package level1.james;

public class refer_비밀지도 {

    public String[] solution (int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for(int i = 0; i< n; i++) {
            // 2진법 변환, 비트 논리 연산자
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for(int i = 0; i<n; i++) {
            // "%ns (ex.%5s) : 글자길이 설정[없을시 0], 오른쪽 정렬(- 붙이면 왼쪽 정렬)
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replace("1","#");
            result[i] = result[i].replace("0"," ");

            System.out.println(result[i]);
        }

        return result;
    }
}