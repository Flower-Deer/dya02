package day02;

import java.util.Arrays;
import java.util.Comparator;

public class 객체이진검색2 {

	public static void main(String[] args) {
		Person[] qArr = { new Person(10,"홍"), new Person(20, "김"),
						   new Person(27,"최"), new Person(25, "이")};
//		int idx = Arrays.binarySearch(qArr, new Person(25,""),Person)
		}
}

class Person{
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public static final Comparator<Person> AGE_ORDER = new AgeComparator();
}

class AgeComparator implements Comparator<Person>{
	//나이를 정렬의 기준으로 삼는 코드 구현.
	public int compare(Person o1, Person o2) {
		return o1.age - o2.age;
	}
}
