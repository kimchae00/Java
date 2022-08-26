package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 김채영
 * 내용 : 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성
 */
public class _07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int result = 0;
		
		if(n1 == n2 && n2 == n3 && n1 == n3) {
			result = 10000 + n1*1000;
			
		}else if(n1==n2 || n1==n3) {
			result = 1000 + n1*100;
			
		}else if(n2==n3) {
			result = 1000 + n2*100;
			
		}else {
			result = Math.max(n1, Math.max(n2, n3)) * 100;
		}
		
		System.out.println(result);
		
		sc.close();
		
	}
}
