package java_declarative_example;
import java.util.List;
import java.util.stream.Collectors;
import static java_declarative_example.Example_1.Gender.*;

public class Example_1 {

	public static void main(String[] args) {
		List<Person> people = List.of(
				new Person("Habib",MALE),
				new Person("Ravi", FEMALE),
				new Person("Hamim",MALE),
				new Person("Hena",FEMALE)
				);
		
				List<Person> females2=people.stream()
					.filter(person->FEMALE.equals(person.gender))
					.collect(Collectors.toList());
					females2.forEach(System.out::println);

       }

	static class Person {
		private final String name;
		private final Gender gender;

		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
	}

	enum Gender {
		MALE, FEMALE;
	}
}
