package lambdaTask1;

public class PrintNameTest {
	public static void getFullName
	(PrintName printName, String lastName, String firstName) {
		System.out.println(printName.getFullName(lastName,firstName));
	}
	
	public static void main(String[] args) {
		PrintNameTest.getFullName((l, f) -> l + f, "류", "준원" );
	}
}
