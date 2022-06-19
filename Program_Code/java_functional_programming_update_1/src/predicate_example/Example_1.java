package predicate_example;

public class Example_1 {
	public static void main(String[] args) {
		System.out.println(isNumberValid("01720128755"));
		System.out.println(isNumberValid("01920128755"));
	}

	static boolean isNumberValid(String number) {
		return number.startsWith("017") && number.length() == 11;
	}
}
