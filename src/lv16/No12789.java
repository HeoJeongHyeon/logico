package lv16;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class No12789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < N; i++) {
            push(str);
        }
    }

    public static boolean push(String str) {
        Stack<Integer> stack = new Stack<>();
    }

}
