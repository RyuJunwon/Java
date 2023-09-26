package castingTest;

import java.util.Iterator;

public class CastingTask {
	
	public void checkVideo(Video video) {
		if(video instanceof Drama) {
			((Drama)video).sellGoods();
		}else if(video instanceof Film) {
			((Film) video).start();
		}else {
			((Animation)video).printSubtitle();
		}
	}
	
	
	public static void main(String[] args) {
		
		CastingTask castingTask = new CastingTask();
		
		Video[] videos = {
				new Animation(),
				new Film(),
				new Drama()
		};
		
		for (int i = 0; i < videos.length; i++) {
			castingTask.checkVideo(videos[i]);
		}
	}
}
