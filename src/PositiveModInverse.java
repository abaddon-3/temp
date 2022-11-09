import java.io.*;

class PositiveModInverse {
    public static void main(String args[])
    {
        int a = 43, n = 660;
        System.out.println(positiveModInverse(a, n));
    }
    public static int positiveModInverse (int a, int n){
        for (int i = 1; i < n; i++) {
            if (((a % n) * (i % n)) % n == 1) {
                return i;
            }
        }
        return 1;
    }
}