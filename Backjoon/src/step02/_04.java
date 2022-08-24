package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 김채영
 * 내용 : 점(x,y)의 사분면 번호를 출력
 */
public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("1");
		}else if(x < 0 && y > 0) {
			System.out.println("2");
		}else if(x < 0 && y < 0) {
			System.out.println("3");
		}else if(x > 0 && y < 0) {
			System.out.println("4");
		}
	}

}
