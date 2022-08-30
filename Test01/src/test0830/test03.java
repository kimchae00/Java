package test0830;

public class test03 {
	public static void main(String[] args) {
		
		int num = 5;
		
		for(int start=0; start<num; start++) {
			for(int j=1; j<num-start; j++) {
				System.out.print("☆");
			}
			for(int end=0; end<start+1; end++) {
				System.out.print("★");
			
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
	
		int n = 4;
		
		for(int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print("☆");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("★");
			}
			for(int j=n-1; j>i; j--) {
				System.out.print("☆");
			}
			System.out.print("\n");
			
		}
		
	}
}
