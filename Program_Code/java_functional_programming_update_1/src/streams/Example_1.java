package streams;
import java.util.List;
import java.util.stream.Collectors;

import static streams.Example_1.Gender.*;

public class Example_1 {
	public static void main(String[] args) {
		List<Person> people = List.of(
				new Person("Mizan", MALE), 
				new Person("Joti", FEMALE), 
				new Person("Manik", MALE),
				new Person("Himel", MALE), 
				new Person("Himu", FEMALE), 
				new Person("Nodi", PREFER_NOT_TO_SAY));
		
		/*-System1-*/
				System.out.println("---different types Gender---");
				people.stream()
				.map(person -> person.gender)
				.collect(Collectors.toSet())
				.forEach(gender -> System.out.println(gender));
		// others way .forEach(System.out::println);
		/*---*/
		
		/*-System2-*/
				System.out.println("---People Names---");
				people.stream()
				.map(person->person.name)
				.collect(Collectors.toList())
				.forEach(System.out::println);
		/*-System2-*/
				
				System.out.println("--name sorting by ascending---");
				people.stream().map(person->person.name).sorted()
				.forEach(System.out::println);
				
				System.out.println("----we count every name length----");
				people.stream()
				.map(person -> person.name)
				.mapToInt(name -> name.length())
				.forEach(System.out::println);
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
		MALE, FEMALE, PREFER_NOT_TO_SAY;
	}
}
