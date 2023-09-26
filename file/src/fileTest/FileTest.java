package fileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
//	예외 던지기: throws
//	메소드 안에서 동일한 Exception이 자주 발생하여 try~catch를 작성해야 한다면,
//	throws를 통해서 사용한 부분으로 Exception을 보내준다.
//	throws를 사용하면 더 이상 메소드 안에서 해당 Exception이 발생하지 않고,
//	메소드를 사용하는 부분에서 한 번만 try~catch를 사용해주면 된다(일괄처리).
	
	public static void main(String[] args) throws IOException {
//		절대 경로 : 어디서든 찾아갈 수 있는 경로, C:/부터 시작되면 절대 경로이다.
//		상대 경로 : 현재 경로를 기준으로 찾아가는 경로, ../a/c, ./a/d
//		이클립스에서 현재 경로는 패키지 폴더가 아니라 프로젝트 폴더이다.
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
		bufferedWriter.write("류준원");
		bufferedWriter.close();
		
		File file = new File("test.txt");
		file.delete();
		
	}
}	
