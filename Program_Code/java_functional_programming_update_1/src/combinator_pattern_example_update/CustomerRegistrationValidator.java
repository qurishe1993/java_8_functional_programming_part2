package combinator_pattern_example_update;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static combinator_pattern_example_update.CustomerRegistrationValidator.ValidationResult;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {

	static CustomerRegistrationValidator isEmailValid() {
		return customer -> customer.getEmail().contains("@") ? ValidationResult.SUCCESS
				: ValidationResult.EMAIL_NOT_VALID;
	}

	static CustomerRegistrationValidator isPhoneValid() {
		return customer -> customer.getPhone().startsWith("017")
				|| customer.getPhone().startsWith("019") && customer.getPhone().length() == 11
						? ValidationResult.SUCCESS
						: ValidationResult.PHONE_NUMBER_NOT_VALID;
	}

	static CustomerRegistrationValidator isAdultyValid() {
		return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ? ValidationResult.SUCCESS
				: ValidationResult.IS_NOT_ADULT;
	}

	default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
		return customer -> {
			ValidationResult result = this.apply(customer);
			return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
		};
	}

	enum ValidationResult {
		SUCCESS, EMAIL_NOT_VALID, PHONE_NUMBER_NOT_VALID, IS_NOT_ADULT;

	}
}
