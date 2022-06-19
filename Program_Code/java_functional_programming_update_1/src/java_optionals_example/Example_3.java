package java_optionals_example;
import java.util.List;
import java.util.function.Predicate;
import static java_optionals_example.Example_3.Gender.*;

public class Example_3 {

	public static void main(String[] args) {
		List<Person> people = List.of(new Person("Wornoz", MALE), new Person("Laila", FEMALE),
				new Person("Qurishe", MALE));

		Predicate<Person> person_pre = person -> FEMALE.equals(person.gender);

		boolean container_only_female = people.stream().anyMatch(person_pre);
				System.out.println(container_only_female);

	}

	static class Person {
		private final String name;
		private final Gender gender;

		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}
	}

	enum Gender {
		MALE, FEMALE;
	}
}
