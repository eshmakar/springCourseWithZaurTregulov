package spring_intro;

import org.springframework.stereotype.Component;

//это аннотация указывается для автоматического создания бинов из класса
@Component("myCat")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Miay");
    }
}
