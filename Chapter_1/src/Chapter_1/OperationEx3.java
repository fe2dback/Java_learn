package Chapter_1;

public class OperationEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // 앞항이 실행되지않아 i = 2 고정
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // 앞항이 실행되어서 뒷행은 실행되지 않아 i = 2 고정
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
