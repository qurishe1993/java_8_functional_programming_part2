package consumer_biconsumer_example;
import java.util.function.BiConsumer;

public class Example_3 {

	public static void main(String[] args) {
		Customer cust_value = new Customer("Wornoz", "01900000000");
		
		biconsumerFun.accept(cust_value, false);
	}

	static BiConsumer<Customer,Boolean> biconsumerFun=(customer,showPhone)->
									System.out.println("Hello " 
									+customer.Cust_Name+", "
									+ "Thanks Registering for java by number " 
									+(showPhone?customer.Cust_Phone:"********"));

	static class Customer {
		private final String Cust_Name;
		private final String Cust_Phone;

		public Customer(String cust_Name, String cust_Phone) {
			Cust_Name = cust_Name;
			Cust_Phone = cust_Phone;
		}
	}
}
