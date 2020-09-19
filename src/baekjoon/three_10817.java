//제출시에는 pakage 는 삭제, class 명은 Main으로 변경하기
package baekjoon;

import java.util.Scanner;
import java.util.ArrayList;

public class three_10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp=0;
		ArrayList<Integer> score =new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		
		for(int x=0;x<3;x++) {
			
			score.add(sc.nextInt());
			
		}
		
		for(int x=0 ; x< score.size(); x++) {
			for(int y=x+1 ; y<score.size(); y++) {
			

				if( score.get(x)< score.get(y)) {
					temp=score.get(x);
					score.set(x, score.get(y));
					score.set(y, temp); //temp == score.get(x)
					
				}
				
				
			}	
		}
		
		
		
		System.out.println( Integer.toString(	score.get( ((score.size()-1) / 2) )		));
		

	}

	

}
