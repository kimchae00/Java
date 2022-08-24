package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 김채영
 * 내용 : 설정해야 하는 알람 시간을 출력 
 */
public class _05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) {
			if(h < 0) {
			m = 15+m;
				h =23;
			}else {
				h -=1;
				m+=m+15;
		}
		}else {
			m = m-45;
		}
		System.out.print(h+" "+m);
	}
}
