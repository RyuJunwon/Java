package myAbstractTest;

public abstract class Electronics {
	public abstract void on();
	public abstract void off();
	
//	final 메소드는 다른 곳에서 재정의될 수 없다.
	public final void shutDown() {
		System.out.println("전원 차단 후 119 신고");
	}
}
