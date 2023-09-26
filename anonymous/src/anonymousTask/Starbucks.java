package anonymousTask;

public class Starbucks {
	
//	지점(객체)에서 첫 1회 등록시 사용할 메소드
	public void register(Form form) {		// 지점에게 작성해야 하는 서류(양식) 받기	
		String[] menu = form.getMenu();	
		
		for (int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + "." + menu[i]);
		}
		
		if(form instanceof StarbucksAdapter) {
			System.out.println("무료 나눔 행사중");
		}else {
			form.sell("아메리카노");
		}
	}
}
