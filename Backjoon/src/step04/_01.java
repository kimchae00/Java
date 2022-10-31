package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/10/31
 * 이름 : 김채영
 * 내용 : 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int a = 0;
		
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		for(int i=0; i<array.length; i++) {
			if(v == array[i]) {
				a++;
			}
		}
		
		System.out.println(a);
		
	}

}
