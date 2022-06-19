package java_optionals_example;
import java.util.Optional;
public class Example_1 {

	public static void main(String[] args) {
		//case:1
			Optional<Object> val1=Optional.empty();
			System.out.println("Case1 Output : " +val1);
			
		//Case:2
			Optional<Object> val2=Optional.of(10);
			System.out.println("Case2 Output : " +val2);
			
		//Case:3
			Optional<Object> val3=Optional.ofNullable(null);
			System.out.println("Case3 Output : " +val3);
			
		//Case:4
			Object val4=Optional.ofNullable("optional program").orElse("default 1");
			System.out.println("Case4 Output : " +val4);
			//if we use null value then it will be show "default"
			
		//Case:5
			Object val5=Optional.ofNullable(null).orElseGet(()->" default 2");
			System.out.println("Case5 Output :" +val5);
			
		//Case:6
			//Object val6=Optional.ofNullable(null).orElseThrow(()-> new IllegalStateException("exception"));
			//System.out.println(val6);
			//in here case:6 has a problem , as a result case7 can not execute. but we need case 7
			//how we can solve this problem? if we solve case6 problem then we have to use optional methods.
			//now we see case : 6 alternative.
			
		//Case:6 problem solving by optional method
			Object val6_Alter=Optional.ofNullable(null).orElseGet(()->"Case 6 , removing nullpointer exception");
			System.out.println(val6_Alter);
			
		//Case :7
			Optional.ofNullable("Hi").ifPresent(System.out::println);
			
	}
}
