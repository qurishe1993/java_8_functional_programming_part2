package combinator_pattern_example_update;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

	private boolean isEmailValid(String email) {
		return email.contains("@");
	}

	private boolean isPhoneValid(String phone) {
		return phone.startsWith("017") || phone.startsWith("019") && phone.length() == 11;
	}

	private boolean isAdultyValid(LocalDate dob) {
		return Period.between(dob, LocalDate.now()).getYears() > 16;
	}

	public boolean isAllValid(Customer customer) {
		return isEmailValid(customer.getEmail()) && isPhoneValid(customer.getPhone())
				&& isAdultyValid(customer.getDob());
	}
}
