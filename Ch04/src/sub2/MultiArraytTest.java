package sub2;

/*
 * 날짜 : 2022/08/22
 * 이름 : 김채영
 * 내용 : Java 다차원 배열 실습하기
 */
public class MultiArraytTest {
	public static void main(String[] args) {
		
		// 1차원 배열
		int []scores = {80, 60, 78, 62, 92};
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		
		System.out.println("scores의 합 : "+total);
		
		// 2차원 배열
		int arr2d[][] = {{1,  2,  3,  4}, 
				         {5,  6,  7,  8}, 
				         {9, 10, 11, 12}};
		
		for(int a=0; a<3; a++) {
			for(int b=0; b<4; b++) {
				System.out.println("arr2d["+a+"]["+b+"] : "+arr2d[a][b]);
			}
		}		
		
		// 3차원 배열
		int [][][] arr3d = {{{1,  2,  3},
			                 {4,  5,  6},
			                 {7,  8,  9}}, 
				            {{10, 11, 12},
			                 {13, 14, 15},
			                 {16, 17, 18}}, 
				            {{19, 20, 21},
			                 {22, 23, 24},
			                 {25, 26, 27}}};
		
		for(int x=0; x<3; x++) {
			for(int y=0; y<3; y++) {
				for(int z=0; z<3; z++) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n", x, y, z, arr3d[x][y][z]);
				}
			}
		}
	}
}