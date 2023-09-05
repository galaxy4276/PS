import java.io.*;
import java.util.*;

class Main {

    static int n, l;
    static StringTokenizer st;
    static Deque<int[]> q = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(st.nextToken());

            while (!q.isEmpty() && q.getLast()[0] > now) {
                q.removeLast();
            }

            q.addLast(new int[] {now, i});

            if (q.getFirst()[1] <= i - l) {
                q.removeFirst();
            }

            bw.write(q.getFirst()[0] + " ");
        }

        bw.flush();
        bw.close();
    }
}