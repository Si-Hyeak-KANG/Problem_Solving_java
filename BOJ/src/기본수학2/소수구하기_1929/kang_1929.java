package 기본수학2.소수구하기_1929;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kang_1929 {

    static boolean[] primeNum = new boolean[1000001];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void primeFunc() {

        for(int i = 1; i < primeNum.length; i++) {
            if(i == 2) {
                primeNum[2] = true;
            } else if(i==3) {
                
            }
        }
    }

    public static void main(String[] args) {



    }
}
