import java.io.*;
import java.util.*;

class Node implements Comparable {
    int origin;
    int value;

    public Node(int origin, int value) {
        this.origin = origin;
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        Node target = (Node) o;
        if (value == target.value) {
            return origin > target.origin ? 1 : -1;
        }

        return value - target.value;
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Node> q = new PriorityQueue<>(Node::compareTo);

        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(br.readLine());
            if (val != 0) q.add(new Node(val, Math.abs(val)));
            else {
                if (q.size() == 0) {
                    System.out.println(0);
                } else {
                    Node node = q.poll();
                    System.out.println(node.origin);
                }
            }
        }

    }
}
