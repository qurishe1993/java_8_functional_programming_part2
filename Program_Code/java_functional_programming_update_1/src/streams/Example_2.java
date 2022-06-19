package streams;
import java.util.List;
import java.util.stream.Collectors;

public class Example_2 {

	public static void main(String[] args) {
		List<Person> people = List.of(new Person("Wornoz", 20000), new Person("Qurishe", 25000),
				new Person("Omi", 15000), new Person("Sonia", 18000), new Person("Jobayeer", 12000));

		people.stream().filter(p -> p.salary > 20000).map(p -> p.name).collect(Collectors.toList())
				.forEach(System.out::println);
	}

	static class Person {
		private final String name;
		private final double salary;

		public Person(String name, double salary) {
			this.name = name;
			this.salary = salary;
		}

	}
}
