package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/11/21
 * 이름 : 김채영
 * 내용 : OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성
 */
public class _08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[sc.nextInt()];

		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		sc.close();
		
		for(int j=0; j<arr.length; j++) {
			
			int count = 0;
			int sum = 0;
			
			for(int k=0; k<arr[j].length(); k++) {
				if(arr[j].charAt(k) == 'O') {
					count++;
				}else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
	}
}