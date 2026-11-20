package BlackBook.lambda.question15;

import java.util.function.Predicate;

import BlackBook.lambda.question15.Person.Gender;

public class NewSample {
    public static void main(String[] args) {
        Predicate<Person> isMale = p -> p.getGender().equals(Gender.MALE);

        Predicate<Person> isFeMale = p -> p.getGender().equals(Gender.FEMALE);

        Predicate<Person> isAdult = p -> p.getAge() >= 20;

        Predicate<Person> criteria = isMale.or(isFeMale.and(isAdult));

        Person person = new Person(Gender.MALE, 19);

        if (criteria.test(person)) {
            System.out.println("OK");
            return;
        }
        System.out.println("NG");
    }
}

class Person {
    public enum Gender {
        MALE, FEMALE
    }

    private Gender gender;
    private int age;

    public Person(Gender gender, int age) {
        super();
        this.gender = gender;
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}