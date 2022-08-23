package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/23
 * 이름 : 김채영
 * 내용 : 시험 성적을 출력하기
 */
public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		int grade;
		
		if(score >= 90 && score <=100) {
			System.out.println("A");
			
		}else if(score >=80 && score <=89) {
			System.out.println("B");
			
		}else if(score >=70 && score <=79) {
			System.out.println("C");
			
		}else if(score >=60 && score <=69) {
			System.out.println("D");
			
		}else {
			System.out.println("F");
		}
	}

}
