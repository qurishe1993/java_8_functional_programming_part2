package java_optionals_example;
import java.util.Optional;

public class Example_2 {

	public static void main(String[] args) {
		// case 1:
		Optional.ofNullable("wornoz@gmail.com")
				.ifPresent(System.out::println);
		
		// case 2:
		Optional.ofNullable("wornoz@gmail.com")
				.ifPresentOrElse((email) -> System.out.println("sending email to " + email), 
						() -> {
								System.out.println("can not send email");
						});
		// case 3:
		Optional.ofNullable(null)
				.ifPresentOrElse((email) -> System.out.println("sending email to " + email), 
						() -> {
						System.out.println("can not send email");
						});
	}
}
