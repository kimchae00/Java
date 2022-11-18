package step04;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 날짜 : 2022/11/04
 * 이름 : 김채영
 * 내용 : 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력
 */
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			h.add(sc.nextInt() % 42);
		}
		
		sc.close();
		System.out.println(h.size());
	}
}
