package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 김채영
 * 내용 : 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력
 */
public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year % 4 == 0 && !(year % 100 == 0)) {
			System.out.println("1");
		}else if(year % 400 == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
