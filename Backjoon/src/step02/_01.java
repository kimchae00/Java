package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/23
 * 이름 : 김채영
 * 내용 : 두 정수 A, B 비교하기
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else if(A == B) {
			System.out.println("==");
		}
	}

}
