package com.game;

import java.util.Random;
import java.util.Scanner;

/**
 * @author chensiqi
 * @version 1.0
 * @date 2019.08.07
 *
 */
public class GameDemo {
    public static void main(String[] args) {
        GameDemo gameRole = new GameDemo();

        System.out.println("==这是一个RPG游戏");
        System.out.println("==1.开始游戏");
        System.out.println("==2.游戏规则");
        System.out.println("==3.结束游戏");
        System.out.println("==4.查看角色信息");
        System.out.println("==5.根据角色名查看角色信息");
        System.out.println("==6.修改角色信息");
        System.out.println("==7.删除角色");
        int num = 0 ;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入您想进行的操作:(1-7)");
            num = scanner.nextInt();
            if(num == 1) {
                System.out.println("请输入您游戏角色的姓名:");
                gameRole.name = scanner.next();
                System.out.println("请输入您游戏角色的种族:(人类/精灵/兽人/矮人/元素)");
                gameRole.race = scanner.next();
                System.out.println("请输入您游戏角色的职业:(战士/法师/猎人/盗贼/治疗)");
                gameRole.profession = scanner.next();
                System.out.println("恭喜您，创建成功！");
            }else if(num == 2) {
                System.out.println("游戏规则");
            }else if (num == 3){
                System.out.println("系统退出");
                break;
            }else if (num == 4){
                GameDemo gameDemo = new GameDemo();
                System.out.println("==你创建的角色信息=====");
                System.out.println("==姓名："+gameRole.name+";");
                System.out.println("==种族："+gameRole.race+";");
                System.out.println("==职业："+gameRole.profession+";");
                System.out.println("==力量值："+gameDemo.power+";");
                System.out.println("==敏捷度："+gameDemo.sensitivity+";");
                System.out.println("==体力值："+gameDemo.physical+";");
                System.out.println("==智力值："+gameDemo.intelligence+";");
                System.out.println("==智慧值："+gameDemo.wisdom+";");
                System.out.println("==初始生命值为：100;");
            }
        }while(num <= 7);
    }


    String name;          //名字
    char sex;             //性别
    String race;          //种族
    String profession;    //职业

    Random random = new Random();
    float power = random.nextFloat() * 9999;          //力量
    float sensitivity = random.nextFloat() * 9999;    //敏捷度
    float physical = random.nextFloat() * 9999;       //体力
    float intelligence = random.nextFloat() * 9999;   //智力
    float wisdom = random.nextFloat() * 9999;         //智慧

    double life;          //生命值
    double MP;            //魔法值
}
