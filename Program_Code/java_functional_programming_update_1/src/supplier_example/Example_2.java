package supplier_example;
import java.util.List;
import java.util.function.Supplier;

public class Example_2 {

	public static void main(String[] args) {
		System.out.println(getUrlConnection1.get());
		System.out.println(getUrlConnection2.get());
	}

	static Supplier<String> getUrlConnection1 = () -> 
								"jdbc:://localhost::3455/customers";

	static Supplier<List<String>> getUrlConnection2 = () ->List.of(
								"jdbc:://localhost::3456/users",
								"jdbc:://localhost::3455/customers"
								); 
}
