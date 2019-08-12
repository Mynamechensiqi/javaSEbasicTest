package com.mxdx;

import java.util.Random;
import java.util.Scanner;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.07
 *
 * 练习 3：实现 Person 类
 * 定义民政业务类 Person
 * 1) 定义属性：编号、名字、性别、年龄、婚否、身份证号、地址、电话、伴侣
 * 2) 提供方法：
 *  结婚（参数是另外一个人）
 *  定义合理的结婚规则结婚结果
 *  如果成功就合理更新双方的属性：婚否和伴侣
 *  返回true，代表结婚成功；结婚失败就返回false
 **/
public class Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.getMarried();
    }
    Random random = new Random();
    int num = random.nextInt(999);          // 编号
    String name;                                   // 名字
    String sex;                                    // 性别
    short age;                                     // 年龄
    boolean marriage;                              // 婚姻
    String IDNum;                                  // 身份证号
    String addres;                                 // 住址
    String phone;                                  // 电话号
    String fere;                                   // 伴侣

    // 结婚条件   年龄 性别 婚否
    public boolean marry(Person Another){
        if (this.sex == "男" ? (this.age>=22 && Another.age>=20) : (this.age>=20 && Another.age>=22)){
            if (this.sex != Another.sex){
                if (this.marriage == false && Another.marriage == false){
                    System.out.println("你们符合结婚的条件");
                    System.out.println(this.name+"将与"+(this.fere = Another.name)+"成为夫妻；");
                    System.out.println(Another.name+"将与"+(Another.fere = this.name)+"成为夫妻。");
                    Scanner scanner = new Scanner(System.in);
                    System.out.println();
                    System.out.println("你们是否愿意成为夫妻？（true:是; false:否）");
                    boolean b = scanner.nextBoolean();
                    if (b == true){
                        System.out.println("恭喜你们成为合法夫妻！");
                    }else{
                        System.out.println("很遗憾！");
                    }
                    return true;
                }
            }
        }
        System.out.println("很抱歉，你们不符合结婚的条件");
        return false;
    }

    //结婚
    public void getMarried(){
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println("==民政局登记系统==");
        System.out.println("==编号："+num);
        System.out.println("==请输入两个人的姓名：");
        person1.name = scanner.next();
        person2.name = scanner.next();
        System.out.println("==请输入"+person1.name+"的性别：");
        person1.sex = scanner.next();
        System.out.println("==请输入"+person2.name+"的性别：");
        person2.sex = scanner.next();
        System.out.println("==请输入"+person1.name+"的年龄：");
        person1.age = scanner.nextShort();
        System.out.println("==请输入"+person2.name+"的年龄：");
        person2.age = scanner.nextShort();
        System.out.println("==请输入"+person1.name+"的婚姻状况(true:已婚；false:单身)：");
        person1.marriage = scanner.nextBoolean();
        System.out.println("==请输入"+person2.name+"的婚姻状况(true:已婚；false:单身)：");
        person2.marriage = scanner.nextBoolean();
        person1.marry(person2);
    }
}
