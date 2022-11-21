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
		int[] arr;
		int C = sc.nextInt();
		
		for(int i=0; i<C; i++) {
			int N = sc.nextInt();
			arr = new int[N];
			double sum = 0;
			
			for(int j=0; j<N; j++) {
				int val = sc.nextInt();
				arr[j] = val;
				sum += val;
			}
			
			double mean = (sum / N);
			double count = 0;
			
			for(int k=0; k<N; k++) {
				if(arr[k] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
		
		
	}

}
