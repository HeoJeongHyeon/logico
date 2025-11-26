package lv16;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No9012 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());

        for (int i = 0; i < s; i++) {
            String str = br.readLine();
            if (push(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


    public static boolean push(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
         return count ==0;
    }

}
