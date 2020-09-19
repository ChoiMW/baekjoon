//제출시에는 pakage 는 삭제, class 명은 Main으로 변경하기
package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class average_10039 {

	public static void main(String[] args) {
		
		int temp = 0;
		int sum=0 ;
		int avg=0 ;
		ArrayList<Integer> score =new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		
		for(int x=0;x<5;x++) {
			
			temp = sc.nextInt();
			if (temp < 40) {
				temp = 40;
			}
			
			score.add(temp);
			
			temp =0;
		}
		
		for(int i=0 ; i<score.size();i++) {
			
			sum += score.get(i);
			
			
		}
		avg = sum / score.size();
		
		System.out.println(avg);
		
	}
	
}
