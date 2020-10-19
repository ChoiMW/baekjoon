package baekjoon;

import java.util.Stack;
import java.io.*;

public class zero_10773 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			Stack<Integer> stack = new Stack<Integer>();
			int num = 0;
			int loop=0;
			int sum=0;
			loop = Integer.parseInt(br.readLine());
			
			for(int i=0;i<loop;i++) {
				
				num = Integer.parseInt(br.readLine());
				if(num==0) {
					stack.pop();
				
				}
				else {
					stack.push(num);
				}
			}
			br.close();
			
	        for(int i=stack.size(); i>0;i--) {
	        	sum+=stack.pop();
	        }
			
	        bw.write(sum+"\n");
	        bw.flush();
	        
	        bw.close();
		}


}

