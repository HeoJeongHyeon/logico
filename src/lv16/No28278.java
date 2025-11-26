package lv16;

import java.io.*;
import java.util.*;

public class No28278 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] arr = line.split(" ");
            int option = Integer.parseInt(arr[0]);

            switch (option) {
                case 1:
                    int num = Integer.parseInt(arr[1]);
                    list.add(num);
                    break;

                case 2:
                    if (list.isEmpty()) sb.append("-1\n");
                    else sb.append(list.remove(list.size() - 1)).append("\n");
                    break;

                case 3:
                    sb.append(list.size()).append("\n");
                    break;

                case 4:
                    sb.append(list.isEmpty() ? 1 : 0).append("\n");
                    break;

                case 5:
                    if (list.isEmpty()) sb.append("-1\n");
                    else sb.append(list.get(list.size() - 1)).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
