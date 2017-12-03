import java.math.BigInteger;

public class Karatsuba {

    public static void main(String[] args) {

        BigInteger a = new BigInteger("3141592653589793238462643383279502884197169399375105820974944592");
        BigInteger b = new BigInteger("2718281828459045235360287471352662497757247093699959574966967627");
        System.out.println(a.multiply(b));
        System.out.println(karatsubaCount(a, b));
    }

    public static BigInteger karatsubaCount(BigInteger x, BigInteger y) {
        try {

            int N = Math.max(x.bitLength(), y.bitLength());

            if (N <= 2) {
                return x.multiply(y);
            } else {
                N = (N / 2) + (N % 2); //Number of bits divided by 2 rounded up

                // x = a + 2^N b,   y = c + 2^N d
                BigInteger b = x.shiftRight(N);
                BigInteger a = x.subtract(b.shiftLeft(N));
                BigInteger d = y.shiftRight(N);
                BigInteger c = y.subtract(d.shiftLeft(N));

                BigInteger ac = karatsubaCount(a, c);
                BigInteger bd = karatsubaCount(b, d);
                BigInteger abcd = karatsubaCount(a.add(b), c.add(d));

                return ac.add(abcd.subtract(ac).subtract(bd).shiftLeft(N)).add(bd.shiftLeft(2 * N));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
