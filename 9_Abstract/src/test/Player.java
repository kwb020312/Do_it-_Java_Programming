package test;

public abstract class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		
	}
	
	public void showLevel(PlayerLevel level) {
		System.out.println("해당 묘기의 난이도는 " + level + " 수준 입니다.");
	}
	
	public void go() {
		System.out.println("묘기를 시작합니다!");
	}
	
	public void stop() {
		System.out.println("묘기를 종료합니다!");
	}
	
	public abstract void jump();
	public abstract void turn();
	
	final public void play(int count) {
		go();
		for(int i = 0 ; i < count ; i ++) {
			jump();
		}
		turn();
		stop();
	}
}
