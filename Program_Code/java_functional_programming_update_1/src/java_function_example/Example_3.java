package java_function_example;

import java.util.function.*;

public class Example_3 {

	public static void main(String[] args) {

		int increment1 = incrementByOne.apply(1);
		System.out.println(increment1);

		int multiply = multiplyBy10.apply(increment1);
		System.out.println(multiply);

		// andThen Function uses
		Function<Integer, Integer> increment1AndThenMuliBy10 = incrementByOne.andThen(multiplyBy10);
		int andthenoutput = increment1AndThenMuliBy10.apply(4);
		System.out.println(andthenoutput);
	}

	static Function<Integer, Integer> incrementByOne = number -> {
		return number + 1;
	};

	static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
}
