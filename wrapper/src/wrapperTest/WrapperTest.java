package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		int data_i = 10;
		
//		auto boxing
		Integer data_I = data_i;
		
//		auto unboxing
		data_i = data_I;
		
		
//		boxing
//		Integer data_I = new Integer(data_i);
//		Integer data_I = Integer.valueOf(data_i);
		
//		unboxing
//		data_I = data_I.intValue();
	}
}
