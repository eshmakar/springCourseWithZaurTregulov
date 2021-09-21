package spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {
    @Autowired
    private  Pet pet;

    //чтобы связывать объекты между собой. В этом примере автоматический создается бин myCat от типа Pet и добавляется сюда в конструктор
//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }


    public Person() {
        System.out.println("Person bean is created");
    }


    public void setPet(Pet pet) {
        System.out.println("Class Person method setPet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet");
        pet.say();
    }
}
