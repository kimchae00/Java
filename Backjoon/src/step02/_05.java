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
		sc.close();
		
		if(m < 45) {
			h--;
			m = m+15;
			if(h < 0) {
				h = 23;
			}
			System.out.println(h+ " "+m);
			
	    }else {
	    	System.out.println(h+" "+(m-45));
	    }
}
}