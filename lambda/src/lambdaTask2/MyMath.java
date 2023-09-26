package lambdaTask2;

import java.util.Iterator;

public class MyMath {
	
		public static Calc operator (String oper) {
			return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
		}
		
		public static void main(String[] args) {
			OperCheck operCheck = e -> {
				String result = "";
				for (int i = 0; i < e.length(); i++) {
					char c = e.charAt(i);
					if(c == '-' || c == '+') {
						result += c;
					}
				}
				return result.split("");
			};
			String expression = "1+9-7";
			
			String[] opers = operCheck.getOpers(expression);
			String[] numbers = expression.split("\\+|\\-");
			int number1 = 0, number2 = 0;
			
			number1 = Integer.parseInt(numbers[0]);
			for (int i = 0; i < opers.length; i++) {
				number2 = Integer.parseInt(numbers[i + 1]);
				number1 = MyMath.operator(opers[i]).calculate(number1, number2);
			}
			
			System.out.println(number1);
		}
}
