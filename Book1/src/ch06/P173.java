package ch06;

public class P173 {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person P = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		
	}

}
