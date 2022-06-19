package combinator_pattern_example;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		Customer customer=new Customer(
				"wornoz",
				"wornoz@gmail.com",
				"01720128755", 
				LocalDate.of(2000,12,12));
		
		System.out.println(new CustomerValidatorService().isValid(customer));
	}
}
