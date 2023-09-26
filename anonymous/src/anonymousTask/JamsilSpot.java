package anonymousTask;

public class JamsilSpot {
	public static void main(String[] args) {
		Starbucks jamsil = new Starbucks();
		
		jamsil.register(new JamsilBilding() {
			
			@Override
			public void sell(String order) {
				String[] menu = getMenu();
				for (int i = 0; i < menu.length; i++) {
					if(menu[i].equals(order)) {
						System.out.println(order + " 무료 나눔 행사 중");
					}
				}
			}
					
			@Override
			public String[] getMenu() {
				return new String[] { "아메리카노", "카페라떼", "아포가토" };
			}
			
		});
		
		
	}
}
