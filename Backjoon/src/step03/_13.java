package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/19
 * 이름 : 김채영
 * 내용 : 첫째 줄에 N의 사이클 길이를 출력
 */
public class _13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int b = 0;
		int c = a;
		
		while(true) {
			a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
			b++;
			
			if(c == a) {
				break;
			}
		}
		System.out.println(b);
	}

}
