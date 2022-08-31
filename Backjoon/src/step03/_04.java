package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/31
 * 이름 : 김채영
 * 내용 : 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사
 */
public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int count = sc.nextInt();
		
		int product[][] = new int[count][2];
		
		int comp = 0;
		for(int i=0; i<product.length; i++) {
			product[i][0] = sc.nextInt();
			product[i][1] = sc.nextInt();
			comp += product[i][0] * product[i][1];
		}
		
		if(price == comp) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
	}

}
