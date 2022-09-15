package ch12;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		
		memberHashSet.addmember(memberLee);
		memberHashSet.addmember(memberSon);
		memberHashSet.addmember(memberPark);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");
		memberHashSet.addmember(memberHong);
		memberHashSet.showAllMember();
	}
}
