package codechef;
import java.util.*;
import java.io.*;

public class PERMCREATE2{
	//Fast input output
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
//    Solution Start 
    static void ans(int n){
        if(n<=3){
              System.out.println(-1);
        }
        else if(n==4){
              System.out.println("3 1 4 2");
        }
        else{
              for(int i =1; i<=n; i+=2){
                    System.out.println(i+" ");
              }
               for(int i =2; i<=n; i+=2){
                    System.out.println(i+" ");
              }
        }
  }
//    Solution End
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                //
                  int num = in.nextInt();
                  ans(num);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}