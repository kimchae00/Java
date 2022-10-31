package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/19
 * 이름 : 김채영
 * 내용 : 각 테스트 케이스마다 A+B를 출력
 */
public class _10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) {
				sc.close();
				break;
			}
				
			System.out.println(a+b);
		}
	}
}
