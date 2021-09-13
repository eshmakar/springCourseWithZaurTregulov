package spring_intro;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dpg bean is created");
    }

    @Override
    public void say() {
        System.out.println("How");
    }
}
