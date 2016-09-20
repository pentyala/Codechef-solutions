 
import java.io.IOException;
import java.io.InputStream;
 
public class test {
 
    public static void main(String[] args) throws IOException {
        InputReader reader = new InputReader(System.in);
        long mod = 1000000007;
        int T = reader.readInt();
        for (int t=0; t<T; t++) {
            int N = reader.readInt();
            int m = reader.readInt();
            long x = reader.readLong()-1;
            long y = reader.readLong()-1;
            long[] A = reader.readLongArray(N);
            long[] X = new long[m+1];
            long[] Y = new long[m+1];
            X[0] = x;
            Y[0] = y;
            for (int i=1; i<=m; i++) {
                X[i] = X[i-1]/2;
                Y[i] = Y[i-1]/2;
            }
            long sum = 0;
            for (long i=X[m]; i<=Y[m]; i++) {
                sum += A[(int)i];
            }
            long aprex = (X[m] == 0) ? 0 : A[(int)X[m]-1];
            long ax = A[(int)X[m]];
            long apostx = (X[m] == N-1) ? 0 : A[(int)X[m]+1];
            long aprey = (Y[m] == 0) ? 0 : A[(int)Y[m]-1];
            long ay = A[(int)Y[m]];
            long aposty = (Y[m] == N-1) ? 0 : A[(int)Y[m]+1];
            for (int mm=m; mm>=1; mm--) {
                sum *= 3;
                sum %= mod;
                if (2*X[mm] == X[mm-1]) {
                    sum -= ax;
                    aprex += ax;
                    apostx += ax;
                } else {
                    sum -= 2*ax;
                    aprex = ax;
                    ax += apostx;
                }
                if (2*Y[mm] == Y[mm-1]) {
                    sum -= ay;
                    aprey += ay;
                    aposty += ay;
                } else {
                    sum += aposty;
                    aprey = ay;
                    ay += aposty;
                }
            }
            sum %= mod;
            if (sum < 0) {
                sum += mod;
            }
            System.out.println(sum);
        }
    }
 
    static final class InputReader {
        private final InputStream stream;
        private final byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
 
        public InputReader(InputStream stream) {
            this.stream = stream;
        }
 
        private int read() throws IOException {
            if (curChar >= numChars) {
                curChar = 0;
                numChars = stream.read(buf);
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }
 
        public final int readInt() throws IOException {
            return (int)readLong();
        }
 
        public final long readLong() throws IOException {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
                if (c == -1) throw new IOException();
            }
            boolean negative = false;
            if (c == '-') {
                negative = true;
                c = read();
            }
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return negative ? -res : res;
        }
 
        public final int[] readIntArray(int size) throws IOException {
            int[] array = new int[size];
            for (int i=0; i<size; i++) {
                array[i] = readInt();
            }
            return array;
        }
 
        public final long[] readLongArray(int size) throws IOException {
            long[] array = new long[size];
            for (int i=0; i<size; i++) {
                array[i] = readLong();
            }
            return array;
        }
 
        public final String readString() throws IOException {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.append((char)c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }
 
        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
 
}