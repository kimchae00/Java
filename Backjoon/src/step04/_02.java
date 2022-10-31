package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/05
 * 이름 : 김채영
 * 내용 : X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력
 */
public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			if(num < x) {
				System.out.print(num + " ");
			}
			}
		}
	}
