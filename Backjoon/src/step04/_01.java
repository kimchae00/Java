package step04;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 날짜 : 2022/09/29
 * 이름 : 김채영
 * 내용 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[n-1]);
	}

}
