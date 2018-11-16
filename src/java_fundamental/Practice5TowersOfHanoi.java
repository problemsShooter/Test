package java_fundamental;

public class Practice5TowersOfHanoi {
    public void solve(int n, String start, String auxiliary, String end) {
        if (n == 1) {
            System.out.println(n + " moved from " + start + " to " + end);
        } else {
            solve(n - 1, start, end, auxiliary);
            System.out.println(n + " moved from " + start + " to " + end);
            solve(n - 1, auxiliary, start, end);
        }
    }

}
