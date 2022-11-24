package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/11/21
 * 이름 : 김채영
 * 내용 : 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력
 */
public class _09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr; // 점수 배열
		int C = sc.nextInt();
		
		for(int i=0; i<C; i++) {
			int N = sc.nextInt(); // 학생 수
			arr = new int[N];
			double sum = 0; // 성적 합계
			
			for(int j=0; j<N; j++) {
				int score = sc.nextInt();
				arr[j] = score;
				sum += score;
			}
			
			double avg = (sum / N);
			double count = 0; // 평균 넘는 학생 수
			
			// 평균 넘는 학생 비율
			for(int j=0; j<N; j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
		sc.close();
	}
}
