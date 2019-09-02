package practice_easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FCTRL {
    public static void main(String[] args)
    {
        InputReader in=new InputReader(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int i=1;
            int ans=0;
            while(n/(int)Math.pow(5,i)>0)
            {
                ans+=((int)(n/(int)Math.pow(5,i)));
                i++;
            }
            System.out.println(ans);
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
