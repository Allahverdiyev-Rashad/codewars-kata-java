import java.util.Arrays;

class GapInPrimes {

    public static long[] gap(int g, long m, long n) {

        long[] primes = primeNumbers(m, n);
        int i = 0;
        while (i < primes.length - 1) {
            if (primes[i] >= m && primes[i] == primes[i + 1] - g) {
                return Arrays.copyOfRange(primes, i, i + 2);
            }
            i++;
        }
        return null;
    }

    private static long[] primeNumbers(long m, long n) {
        long[] primes = new long[(int) (n - m)];
        int numPrimes = 0;
        boolean prime;
        int i = (int) m;
        while (i < (int) n) {
            prime = true;
            int j = 2;
            while (j < Math.sqrt((double) i) + 1) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
                j++;
            }
            if (prime == true) {
                primes[numPrimes] = (long) i;
                numPrimes++;
            }
            i++;
        }
        return Arrays.copyOfRange(primes, 0, numPrimes);
    }

}