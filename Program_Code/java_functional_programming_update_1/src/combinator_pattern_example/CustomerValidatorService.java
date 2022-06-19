package combinator_pattern_example;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

	private boolean isEmailValid(String email) {
		return email.contains("@");
	}

	private boolean isPhoneValid(String phone) {
		return phone.contains("013") || phone.contains("017") && phone.length() == 11;
	}

	private boolean isAdultValid(LocalDate dob) {
		return Period.between(dob, LocalDate.now()).getYears() > 16;
	}
	
	public boolean isValid(Customer customer) {
		return isEmailValid(customer.getEmail()) 
				&& isPhoneValid(customer.getPhone()) 
				&& isAdultValid(customer.getDob());
	}
}
