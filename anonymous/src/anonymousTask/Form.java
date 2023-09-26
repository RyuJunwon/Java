package anonymousTask;

public interface Form {
//	지점별 메뉴
	public String[] getMenu();
//	지점별 판매 방식
	public void sell(String order);
}
