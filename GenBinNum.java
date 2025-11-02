import java.util.*;

public class GenBinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateBinaryNumbers(n);
        sc.close();
    }

    static void generateBinaryNumbers(int n) {
        Queue<String> q = new LinkedList<>();

        q.add("1"); // Start with "1"

        for (int i = 0; i < n; i++) {
            String curr = q.poll();  // Remove front
            System.out.print(curr + " "); // Print it

            // Enqueue the next two binary numbers
            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
}
