package ch06;

public class P195 {
	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance(); 
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
	}
}
