package spring_intro;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created (Constructor)");
    }

    @Override
    public void say() {
        System.out.println("How");
    }

    void init(){//этот метод будет выполняться сразу после создания бина (если scope - singleton)
        System.out.println("This is init method");
    }
    void destrooy(){//этот метод будет выполняться после выполенения всех работ, после закрытия context(если scope - singleton)
        System.out.println("This is destroy method");
    }
}
