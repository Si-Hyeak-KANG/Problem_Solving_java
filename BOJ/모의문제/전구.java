package 모의문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 전구 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] lights = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            lights[i] = Integer.parseInt(st.nextToken());
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken())-1;
            int c = Integer.parseInt(st.nextToken());

            switch (a) {
                case 1:
                    lights[b] = c;
                    break;
                case 2:
                    for (int i = b; i < c; i++) {
                        if (lights[i] == 1) {
                            lights[i] = 0;
                        } else {
                            lights[i] = 1;
                        }
                    }
                    break;
                case 3:
                    for (int i = b; i < c; i++) {
                        lights[i] = 0;
                    }
                    break;
                case 4:
                    for (int i = b; i < c; i++) {
                        lights[i] = 1;
                    }
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int light : lights) {
            sb.append(light).append(" ");
        }
        System.out.println(sb);
    }
}
