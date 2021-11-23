import java.util.Scanner;


public class Arrays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a lenght of array");
		
		int value = input.nextInt();
		int[] numbers;
		numbers = new int[value];
		
		
		
		for(int i=0; i<value; i++) {
			System.out.println("Enter number " + i + "th value array");
			numbers[i] = input.nextInt();
		}
		
		
		System.out.println("Array values are");
		for(int i=0; i<value; i++) {
			System.out.println(i + "th of value array is :" + numbers[i]);
		}
	}
}