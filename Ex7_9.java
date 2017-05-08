
import java.util.Scanner;

public class Ex7_9 {
	
	static final int MAX_NUM = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] n = new double [MAX_NUM];
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter " + MAX_NUM + " numbers: ");
		for (int i = 0; i < n.length; i++) n[i] = input.nextDouble();
		
		System.out.println("The minimum number is: " + min(n));

	}

	private static double min(double[] array) {
		// TODO Auto-generated method stub
		
		double min = array [0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) min = array[i];
		}
		return min;
	}

}
