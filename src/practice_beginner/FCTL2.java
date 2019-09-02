package practice_beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class FCTL2 {
    public static void main(String[] args)
    {
        InputReader in=new InputReader(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            BigInteger fact=BigInteger.ONE;
            for(int i=2;i<=n;i++)
                fact=fact.multiply(BigInteger.valueOf(i));
            System.out.println(fact);
        }
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
