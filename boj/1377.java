import java.io.*;
import java.util.*;

class Data implements Comparable<Data> {
    int value;
    int index;

    public Data(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(Data o) {
        return value - o.value;
    }
}

class Main {
    static Data[] A;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        A = new Data[N];
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(br.readLine());
            A[i] = new Data(val, i);
        }

        Arrays.sort(A);
        int max = 0;

        for (int i = 0; i < N; i++) {
            if (max < A[i].index - i) {
                max = A[i].index - i;
            }
        }

        System.out.println(max + 1);

    }

}
