package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 김채영
 * 내용 : A+B를 출력
 */
public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		for(int i=0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		
	}
}
