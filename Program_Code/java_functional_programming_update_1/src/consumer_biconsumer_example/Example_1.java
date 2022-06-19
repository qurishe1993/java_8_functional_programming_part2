package consumer_biconsumer_example;

public class Example_1 {

	public static void main(String[] args) {
		Customer cust_value = new Customer("Wornoz", "01900000000");
		CustomerFunction(cust_value);
	}

	static class Customer {
		private final String CustomerName;
		private final String CustomerPhoneNumber;

		public Customer(String customerName, String customerPhoneNumber) {
			CustomerName = customerName;
			CustomerPhoneNumber = customerPhoneNumber;
		}
	}

	static void CustomerFunction(Customer customer) {
		System.out.println("Hello " + customer.CustomerName + ", "
				+ "Thanks Registering for Java By Phone Number "
				+ customer.CustomerPhoneNumber);
	}
}
