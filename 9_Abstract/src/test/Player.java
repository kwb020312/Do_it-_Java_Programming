package test;

public abstract class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		
	}
	
	public void showLevel(PlayerLevel level) {
		System.out.println("�ش� ������ ���̵��� " + level + " ���� �Դϴ�.");
	}
	
	public void go() {
		System.out.println("���⸦ �����մϴ�!");
	}
	
	public void stop() {
		System.out.println("���⸦ �����մϴ�!");
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
