package sub07;

/*
 * 날짜 : 2022/09/28
 * 이름 : 김채영
 * 내용 : 자바 총정리 연습문제
 */
interface Player {
	public void play();
}

class BaseballPlayer implements Player {
	 public void play() {
		 System.out.println("야구를 합니다.");
	 }
}

class FootballPlayer implements Player {
	public void play() {
		System.out.println("축구를 합니다.");
	}
}

public class Test07 {
	public static void main(String[] args) {
		
		Player p1 = new BaseballPlayer(); 
		Player p2 = new FootballPlayer();
		
		playGame(p1);
		playGame(p2);
	}
	
	public static void playGame(Player p) {
		p.play();
	}
}
