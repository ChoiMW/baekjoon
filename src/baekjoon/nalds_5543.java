//제출시에는 pakage 는 삭제, class 명은 Main으로 변경하기

package baekjoon;


import java.util.Scanner;
import java.util.Arrays;

public class nalds_5543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	burger = 0;
		int drink = 0;
		int price= 0;
		int temp = 0;
		Scanner sc = new Scanner(System.in);


		//햄버거부분
		burger = sc.nextInt();
		
		for(int i=0; i<2 ; i++) {

			temp = sc.nextInt();
			if(burger > temp) {
				burger = temp;
			}
			
		}
		
		
		//음료 부분
		drink = sc.nextInt();
		
		temp = sc.nextInt();
		if(drink > temp) {
			drink = temp;
		}
		
		price = burger + drink - 50 ;
		
		System.out.println(price);
		
	}

}
