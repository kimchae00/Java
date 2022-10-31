package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/10/05
 * 이름 : 김채영
 * 내용 : 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력
 */
public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num  = new int[9];
		int max = 0;
		int index = 0;
		
		
		for(int i=0; i<9; i++) {
			int input = sc.nextInt();
			num[i] = input;
		}
		
		for(int i=0; i<9; i++) {
			if(num[i] > max) {
				max = num[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
