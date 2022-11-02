package Chapter_1;

public class TypeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var i = 10; //int i = 10으로 컴파일
		var j = 10.0; //double j = 10.0으로 컴파일
		var str = "hello"; // String str = "hell"로 컴파일
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3;
	}

}
