// https://www.acmicpc.net/problem/2018

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 1, count = 1, sdx = 1, edx = 1;
        while (edx != N) {
            if (sum == N) {
                edx++;
                sum += edx;
                count++;
            } else if (sum > N) {
                sum -= sdx;
                sdx++;
            } else {
                edx++;
                sum += edx;
            }
        }

        System.out.println(count);
    }
}
