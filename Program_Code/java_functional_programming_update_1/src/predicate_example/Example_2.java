package predicate_example;
import java.util.function.Predicate;
public class Example_2 {

	public static void main(String[] args) {
		System.out.println(isNumberValid.test("01720128755"));
		System.out.println(isNumberValid.test("01920128755"));
	}
	
	static Predicate<String> isNumberValid=number->
			number.startsWith("017") && number.length()==11;
}
