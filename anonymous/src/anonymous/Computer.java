package anonymous;

public class Computer {
	public static void main(String[] args) {
		Game game = new Game() {
			
			@Override
			public void play() {
				System.out.println("실행");
				
			}
			
			@Override
			public void exit() {
				// TODO Auto-generated method stub
				
			}
		};
		game.play();
	}
}
