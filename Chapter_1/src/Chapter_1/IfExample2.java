package Chapter_1;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 9;
		int charge;
		
		if(age < 8)
		{
			charge = 1000;
			System.out.println("kid before preschool");
		}
		else if(age < 14)
		{
			charge = 2000;
			System.out.println("elementschool student");
		}
		else if(age < 20)
		{
			charge = 2500;
			System.out.println("highschool student");
		}
		else
		{
			charge = 3000;
			System.out.println("public");
		}
		System.out.println("pay" + charge + "won");
		
	}

}
