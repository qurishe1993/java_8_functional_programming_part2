package combinator_pattern_example_update;

import java.time.LocalDate;
import static combinator_pattern_example_update.CustomerRegistrationValidator.*;

public class Test {

	public static void main(String[] args) {
		Customer customer=new Customer(
				"wornoz",
				"wornoz@gmail.com",
				"01944428046",
				LocalDate.of(2000, 9, 29)
				);
		
		System.out.println(new CustomerValidatorService().isAllValid(customer));
		
		ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAdultyValid())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

	}
}
