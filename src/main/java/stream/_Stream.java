package stream;

import java.util.List;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Jack", Gender.MALE),
                new Person("Linda", Gender.FEMALE),
                new Person("Mary", Gender.FEMALE),
                new Person("Helen", Gender.FEMALE)
        );

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

        boolean b = people.stream()
                .noneMatch(person -> Gender.FEMALE.equals(person.gender));

        System.out.println(b);
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
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        FEMALE, MALE
    }
}
