import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 11659 구간 합
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int suNo = Integer.parseInt(st.nextToken());
        int sumNo = Integer.parseInt(st.nextToken());
        long[] arr = new long[suNo + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < suNo; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < suNo; i++)
            arr[i] = arr[i - 1] + arr[i];

        for (int i = 0; i < sumNo; i++) {
            st = new StringTokenizer(br.readLine());
            int startIdx = Integer.parseInt(st.nextToken()) - 1;
            int endIdx = Integer.parseInt(st.nextToken()) - 1;
            long result = startIdx != 0 ? arr[endIdx] - arr[startIdx - 1] : arr[endIdx];
            System.out.println(result);
        }
    }
}
