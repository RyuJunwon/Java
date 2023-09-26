package interfaceTest;

public interface Animal {
	int eyes = 2; // final static이 생략 된 것임. 
	final static int nose = 1; 
	
	public abstract void sitDown();
	public void waitNow();
	public void poop();
	public void bang();
	public void showHand();
}
