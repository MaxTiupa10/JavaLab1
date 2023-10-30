
public class Fibon {

    public int cur;


    public int nFibon(int n) {
        int preprev = 1, prev = 1;
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                cur = 1;
            } else {
                cur = preprev + prev;
                preprev = prev;
                prev = cur;
            }
        }
        return cur;
    }

    public boolean check(int n, int num) {
        return num < Math.pow(1.75, n);
    }
}