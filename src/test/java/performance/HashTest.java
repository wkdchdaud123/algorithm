package performance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HashTest {

    @Test
    @DisplayName("Hashcode equals test")
    public void hashTest(){

        Person person1 = new Person("장총명");
        Person person2 = new Person("장총명");
        Person person3 = new Person("이광복");

        System.out.println(person1.equals(person2));
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

    }
}

class Person{
    private String name;

    Person(String name){
        this.name = name;
    }
}
