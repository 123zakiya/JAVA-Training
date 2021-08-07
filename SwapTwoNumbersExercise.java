package practice;

public class SwapTwoNumbersExercise {

	public static void main(String[] args) {
		
		float first = 2.50f, swcond = 4.50f;
		
		System.out.println("--Before swap--");
		System.out.println("First number =" + first);
		System.out.println("Second number =" + swcond);
		
		float temporary = first;
		
		first = swcond;
		
		swcond = temporary;
		
		System.out.println("--after swap --");
		System.out.println("First number =" + first);
		System.out.println("Second number =" + swcond);
		

	}

}
