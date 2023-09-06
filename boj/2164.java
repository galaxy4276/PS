import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/2164
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deck = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) deck.addLast(i);

        while (deck.size() != 1) {
            deck.removeFirst();
            Integer next = deck.removeFirst();
            deck.addLast(next);
        }

        System.out.println(deck.getFirst());
    }
}
