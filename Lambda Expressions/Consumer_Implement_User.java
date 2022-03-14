/*	Consumer Functional Interface can be used in all contexts 
*       where an object needs to consumed
*/

import java.util.Objects;
import java.util.function.Consumer;

class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(age, gender);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		return age == other.age && Objects.equals(gender, other.gender);
//	}
	
	
}

public class Consumer_Implement_User {
	public static void main(String[] args) {

		Consumer<Person> consumer = person -> System.out.print(person);
		consumer.accept(new Person("Vikash", 24, "Male"));
	}

}
 
