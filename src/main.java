
class main {
    public static void main(String[] args) {
        int t = 0, v = 1;
        int s = 1, u = 0;
        int a = 284, b = 168;
        int r, q, newu, newv;

        System.out.print("gcd(" + a + ", " + b + ") = ");

        while (b != 0) {
            r = a % b;
            q = a / b;
            a = b;
            b = r;
            newu = s - (u * q);
            newv = t - (v * q);
            s = u;
            t = v;
            u = newu;
            v = newv;
        }

        System.out.print(a + " and s = " + s + " t = " + t);
    }
}