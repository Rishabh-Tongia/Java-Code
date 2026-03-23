import java.util.*;

public class EularsPhiTheoram {

    public static int phi(int n) {
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (gcd(i, n) == 1) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(phi(n));
    }
}
