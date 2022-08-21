package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 김채영
 * 내용 : 곱셈에서 빈 칸의 값을 구하기
 */
public class _12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A,B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		System.out.println(A*(B%10));
		System.out.println(A*(((B%100)-(B%10))/10));
		System.out.println((A*((B%1000)-(B%100)))/100);
		System.out.println(A*B);
		
		
	}

}
