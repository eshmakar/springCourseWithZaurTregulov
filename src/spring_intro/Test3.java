package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args)  {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//чтение конфигурационного файла
        Person person = context.getBean("myPerson", Person.class);//получение бинов
        person.callYourPet();//вызов методов
//        System.out.println(person.getSurName());
//        System.out.println(person.getAge());
        context.close();

    }
}
