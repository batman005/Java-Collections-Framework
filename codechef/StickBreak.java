package codechef;

import java.util.*;
import java.io.*;

public class StickBreak {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine().trim();
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

	public static void main(String[] args) {
		try {
			FastReader in = new FastReader();
			FastWriter out = new FastWriter();
			int testCases = in.nextInt();
			while (testCases-- > 0) {
				// write code here
				int N = in.nextInt();
				int X = in.nextInt();
				
				if(N % X == 0)
					  out.println("0");
				else
					out.println("1");
			}
			out.close();
		} catch (Exception e) {
			return;
		}
	}
}
