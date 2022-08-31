package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/31
 * 이름 : 김채영
 * 내용 : 1부터 n까지의 합 구하기
 */
public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
	}

}
