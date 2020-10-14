package Lab1;

public class Question1 {

	public static void main(String[] args) {
		
	/*
	 	Write a method that accepts a string and a non-negative number, 
	 	and prints a larger string that is number copies of the original String

		stringTimes("Hi", 2); => HiHi
		stringTimes("Hi", 3); => HiHiHi
		stringTimes("Hi", 1); => Hi

	*/

		stringTimes("Hi", 2);
		stringTimes("Hi", 3);
		stringTimes("Hi", 1); 

}

	public static void stringTimes(String string, int number) {

		String largerString = "";
		for (int i = 1; i <= number; i++) {
	
			largerString = largerString + string;
		}
		System.out.println(largerString);
	

// 	Other solution
		
//			for (int i = 1; i <= number; i++) {
//				System.out.print(string);
//			}
//			System.out.println();

  }

}
