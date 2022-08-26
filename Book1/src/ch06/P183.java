package ch06;

public class P183 {
	public static void main(String[] args) {
		Student0 studentLee = new Student0();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student0 studentSon = new Student0();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
		
	}
}
