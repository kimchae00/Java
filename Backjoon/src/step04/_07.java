package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/11/21
 * 이름 : 김채영
 * 내용 : 새로운 평균을 구하는 프로그램을 작성
 */
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int score[] = new int[N];
		int M = 0;
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
			if(M<score[i]) {
				M = score[i];
			}
			sum += score[i];
		}
		avg = 100.0 * sum / M / N; 
		
		System.out.println(avg);
	}
}
