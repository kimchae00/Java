package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 김채영
 * 내용 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력
 */
public class _08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=n; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
