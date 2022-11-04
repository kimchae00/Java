package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/11/04
 * 이름 : 김채영
 * 내용 : 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성
 */
public class _05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] stud  = new int[31];
		
		for(int i=1; i<=28; i++) {
			int success = sc.nextInt();
			stud[success] = 1;
		}
		
		for(int i=1; i<stud.length; i++) {
			if(stud[i] != 1)
				System.out.println(i);
		}
		sc.close();
	}
}
