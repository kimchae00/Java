package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 김채영
 * 내용 : 세 수가 주어졌을 때 네 가지 값을 구하기
 */
public class _11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println( (A + B)%C);
		System.out.println( ( (A % C)+(B % C) ) % C);
		System.out.println( (A * B) % C);
		System.out.println( ( (A % C) * (B % C) ) % C);
		}
	}


