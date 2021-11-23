
public class Strarray {
	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "Hi";
		words[2] = "Welcome";
		
		System.out.println(words[1]);
		
		String[] fruits = {"Apple", "Orange", "Mango"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	}
}
