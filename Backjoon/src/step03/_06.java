package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 김채영
 * 내용 : 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력
 */
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + (b+c));
		}
		sc.close();
	}
}
