// https://www.acmicpc.net/problem/1940

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());

        A = Arrays.stream(A).sorted().toArray();

        int sdx = 0, edx = A.length - 1, count = 0;

        while (sdx != edx) {
            int sum = A[sdx] + A[edx];
            if (sum == M) {
                count++;
                sdx++;
            } else if (sum > M) {
                edx--;
            } else {
                sdx++;
            }
        }

        System.out.println(count);

    }
}
