package spring_intro;

public class Person {
    private Pet pet;

//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }


    public Person() {
        System.out.println("Person bean is created");
    }

    public void setPet(Pet pet) {//если используется класс без конструктора, тогда можно все сделать через сеттеры
        System.out.println("Class Person method setPet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely pet");
        pet.say();
    }
}
