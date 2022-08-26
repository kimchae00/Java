package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 김채영
 * 내용 : 종료되는 시각의 시와 분을 공백을 사이에 두고 출력
 */
public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int m = 60 * a + b;
		m += c;
		
		int hour = (m/60) % 24;
		int min = m % 60;
		
		System.out.println(hour+" "+min);
		
	}
}
