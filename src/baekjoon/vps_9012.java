package baekjoon;

import java.util.Stack;
import java.io.*;


public class vps_9012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String [] data ;
		Stack<Integer> stack = new Stack<Integer>();
		int j=0;
		
		
		int loop = Integer.parseInt(br.readLine());

		String [] vp = new String [loop] ;
		
		for (int i=0 ; i<loop ; i++) {
			vp[i]=br.readLine();
		}
		
		for (int i=0 ; i<loop ; i++) {
			
			data = vp[i].split("");
			for(j=0;j<data.length;j++) {

				
				if(data[j].compareTo("(") == 0) {
					//'('
					stack.push(0);
				}
				else if(data[j].compareTo(")") == 0) {
					//')'
					if(stack.size()<1) {

						break;
					}
					else {
						stack.pop();
						
					}
				}
				
			}
			if(j < data.length ) {
				//중간종료
				bw.write("NO\n");
			}
			else {
				//'\0'
				if(stack.size()!=0) {
					bw.write("NO\n");
				}
				else{
					bw.write("YES\n");
				}
			}

			bw.flush();
			//초기화
			stack.clear();
			
		}
		br.close();
		bw.close();
	}

}
