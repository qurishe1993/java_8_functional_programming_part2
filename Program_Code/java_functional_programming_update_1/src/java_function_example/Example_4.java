package java_function_example;
import java.util.function.*;

public class Example_4 {

	public static void main(String[] args) {
		
		int output1=increment1.apply(1);
		System.out.println("after increment: "+output1);
		
		int output2=multiby10.apply(output1);
		System.out.println("output1 multiplication :" +output2);
		
		//BiFunction takes 2 arguments and produces 1 result
		int output3=bifunction.apply(4, 100);
		System.out.println("BiFunction Output:"+output3);
	}
	
	static Function<Integer,Integer> increment1=number->number+1;
	static Function<Integer,Integer> multiby10=number->number*10;
	static BiFunction <Integer,Integer,Integer> bifunction=(input1,input2)->(input1+1)*input2;
}
