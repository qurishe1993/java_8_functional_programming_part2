package java_imperative_example;

import java.util.ArrayList;
import java.util.List;
import static java_imperative_example.Example_1.Gender.*;

public class Example_1 {

	public static void main(String[] args) {
		List<Person> people = List.of(
				new Person("Habib",MALE),
				new Person("Ravi", FEMALE),
				new Person("Hamim",MALE),
				new Person("Hena",FEMALE)
				);
		//Imperative Approach
		
		List<Person> females=new ArrayList<>();
		
		for (Person person : people) {
			if(FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}
		
		for (Person female : females) {
			System.out.println(female);
		}
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
