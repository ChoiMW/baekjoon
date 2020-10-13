package baekjoon;

import java.util.Scanner;

public class fibo5_10870 {



	    public static int fibo(int num){
	        
	        if(num==0){
	            return 0;

	        }
	        else if(num == 1)
	        {
	            return 1;

	        }
	        else if(num == 2)
	        {
	            return 1;

	        }
	        else{
	            return fibo(num-1) + fibo(num-2);

	        }
	        
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);

	        int ret = fibo(sc.nextInt());
			
			System.out.println(ret);
            
            sc.close();
			
		}



}
