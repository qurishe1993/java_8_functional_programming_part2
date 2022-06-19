package java_function_example;
import java.util.function.*;

public class Example_2 {
	public static void main(String[] args) {
		int output1 = incremntByOne.apply(1);
		System.out.println(output1);
	}
	static Function<Integer, Integer> incremntByOne = number -> number + 1;
}
