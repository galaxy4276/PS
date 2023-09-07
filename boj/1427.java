import java.io.*;
import java.util.*;


class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] charArray = input.toCharArray();
        int size = input.length();
        int[] R = new int[size];
        for (int i = 0; i < size; i++)
            R[i] = Character.getNumericValue(charArray[i]);

        int temp, max = 0, index = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (max < R[j]) {
                    max = R[j];
                    index = j;
                }

                if (max == R[j]) { index = j; }
            }

            temp = R[i];
            R[i] = max;
            R[index] = temp;
            max = 0;
        }

        for (int i = 0; i < size; i++)
            System.out.print(R[i]);
    }

}
