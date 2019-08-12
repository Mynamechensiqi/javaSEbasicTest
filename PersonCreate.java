package com.lian;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.09
 * @apiNote 定义一个PersonCreate类：
 *     创建两个对象，分别是zhangsan，33岁，1.73；lishi，44，1.74
 *     分别调用对象的sayHello()方法。
 **/
public class PersonCreate {

    int age;

    public static void main(String[] args) {

        PersonCreate personCreate1 = new PersonCreate(33);
        Person person1 = new Person();
        person1.name = "zhangsan";
        person1.heigth = 1.73;
        System.out.println(person1.name);
        System.out.println(personCreate1.age+"岁");
        System.out.println(person1.heigth);
        person1.sayHello(person1.name);

        PersonCreate personCreate2 = new PersonCreate(44);
        Person person2 = new Person();
        person2.name = "lisi";
        person2.heigth = 1.74;
        System.out.println(person2.name);
        System.out.println(personCreate2.age);
        System.out.println(person2.heigth);
        person2.sayHello(person2.name);


    }
    public PersonCreate(int age){
        this.age = age;
    }

}
