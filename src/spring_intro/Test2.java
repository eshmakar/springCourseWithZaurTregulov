package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static int count = 0;
    public static void main(String[] args)  {
            ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");
            Pet pet = contex.getBean("myPet", Pet.class);
            contex.close();
            pet.say();



    }
}
