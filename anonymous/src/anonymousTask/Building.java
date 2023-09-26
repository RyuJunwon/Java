package anonymousTask;

public class Building {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();
		
		
		jamsil.register(new StarbucksAdapter() {
			
			@Override
			public String[] getMenu() {
				return new String[] { "아메리카노", "카페라떼", "아포가토" };
			}
		});
		
		gangnam.register(new Form() {
				
//			잠실점 오픈, 무료 나눔 행사중 출력
			
			@Override
			public void sell(String order) {
				String[] menu = getMenu();
				for (int i = 0; i < menu.length; i++) {
					if(menu[i].equals(order)) {
						System.out.println(order + " 판매 완료");
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
