package sub3;

/*
 * 날짜 : 2022/08/23
 * 이름 : 김채영
 * 내용 : Java 메서드 실습하기
 */
public class MethodTest {
	public static void main(String[] args) {
	
		// 메서드 호출(실행)
		int r1 = f(1);
		int r2 = f(2);
		int r3 = f(3);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		// 메서드 스택
		int t1 = sum(1, 10);
		int t2 = sum(1, 100);
		
		System.out.println("t1 : "+t1);
		System.out.println("t2 : "+t2);
		
	}// main end

    // 메서드 정의	
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
	}
	
	// 메서드 정의
	public static int sum(int start, int end) {
		
		int total = 0;
		
		for(int k=start; k<=end; k++) {
			total += k;
		}
		
		return total;
	}
	
	
	
}
