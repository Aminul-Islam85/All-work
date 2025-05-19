public class SecondProgram {

	public static void main(String[] args) {
		int[] w1 = { 10, -2, 18, 9, 8, 7, 6 };
		int[] w2 = { 10, 1, 2, 3, 4, 5, 6 };
		
		Temperatures t = new Temperatures("Week 1", w1);
		System.out.println(t);
		
		System.out.println();
		
		t = new Temperatures("Week2", w2);
		System.out.println(t);

	}

}
