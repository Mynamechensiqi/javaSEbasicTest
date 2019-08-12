package com.zuoye;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chensiqi
 * @version 1.0
 * @ClassName Student1
 * @date 2019/8/11
 * @description 学生信息管理系统
 **/
public class Student1 {
    int id;
    String name;
    String sex;
    int age;
    String grade;
    String address;
    long phone;
    String email;

    //学生库
    static Student1[] student1s = {};

    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.welcome();
    }

    // 判断学生 id
    public boolean judgeId(int id){
        for (int i = 0; i < student1s.length; i++) {
            if (id == student1s[i].id){
                return true;
            }
        }
        return false;
    }

    //欢迎界面
    public void welcome() {
        System.out.println("---------------欢迎登录学生信息管理系统---------------");
        System.out.println("1.登录     2.退出");
        System.out.println("---------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择：");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("欢迎登录！");
            System.out.println("请输入用户名：");
            String name = scanner.next();
            System.out.println("请输入密码：");
            String pwd = scanner.next();
            if (name.equals("admin") && pwd.equals("admin")) {
                System.out.println("登录成功");
                System.out.println("欢迎您：" + name);
                operation();
            } else {
                System.out.println("登录失败");
            }
        } else {
            return;
        }
    }

    //操作界面
    public void operation() {
        System.out.println("***********************请选择要操作的信息对应数字************************");
        System.out.println("*1.查看学生信息  2.添加学生信息  3.删除学生信息  4.修改学生信息  5.退出    *");
        System.out.println("**********************************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择：");
        int num = scanner.nextInt();
        if (num == 1) {
            check();
        } else if (num == 2) {
            addition();
        } else if (num == 3) {
            delInfo();
        }else if (num == 4){
            alter();
        }else {
            System.exit(0);
        }
    }


    // 添加学生信息
    public void addition(){
        Student1 student1 = new Student1();
        System.out.println("**************************添加学生信息**********************************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生id：");
        student1.id = scanner.nextInt();
        if (judgeId(id) == true) {
            System.out.println("此" + id + "已存在，请重新输入");
            System.out.println("请输入学生id：");
            int id2 = scanner.nextInt();
        }
        System.out.println("请输入学生姓名：");
        student1.name = scanner.next();
        System.out.println("请输入学生性别：");
        student1.sex = scanner.next();
        System.out.println("请输入学生年龄(只能1-120之间的数字)：");
        student1.age = scanner.nextInt();
        System.out.println("请输入学生所属年级(只能初级、中级、高级)：");
        student1.grade = scanner.next();
        System.out.println("请输入学生地址：");
        student1.address = scanner.next();
        System.out.println("请输入学生联系方式(11位手机号码)：");
        student1.phone = scanner.nextLong();
        System.out.println("请输入学生电子邮箱(包含@和.com)：");
        student1.email = scanner.next();
        if (student1 != null) {
            student1s = Arrays.copyOf(student1s, student1s.length+1);
            student1s[student1s.length-1] = student1;
            System.out.println("数据保存成功，系统将自动返回上层目录~");
            operation();
        } else {
            System.out.println("数据保存失败~");
            return;
        }
    }

    // 修改学生信息
    public void alter(){
        Scanner scanner = new Scanner(System.in);
        new Student1();
        int age;
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("-1.根据ID修改学生全部信息  2.根据ID修改学生部分信息  3.返回上级目录  4.系统退出   -");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("请选择：");
        int num = scanner.nextInt();
        if (num == 1){
            System.out.println("请输入要修改学生的id：");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            for (int i = 0; i < student1s.length; i++) {
                if (id == student1s[i].id){
                    addition();
                    student1s[i] = student1s[student1s.length-1];
                    student1s = Arrays.copyOf(student1s, student1s.length-1);
                }else{
                    System.out.println("id不存在");
                }
            }
            System.out.println("修改成功！");
            alter();
        }else if (num == 2){
            alterPortion();
            alter();
        }else if (num == 3){
            alter();
        }else{
            System.exit(0);
        }
    }

    //修改部分信息
    public void alterPortion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改学生的id：");
        int id = scanner.nextInt();
        for (int i = 0; i < student1s.length; i++) {
            if (id == student1s[i].id){
                alterAttribute(student1s[i]);
            }else{
                System.out.println("id不存在");
            }
        }
        System.out.println("修改成功！");
    }

    // 选择要修改的属性
    public void alterAttribute(Student1 student1){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的属性：");
        String string = scanner.next();
        System.out.println("请输入修改后的数据：");
        switch (string){
            case "id":
                student1.id = scanner.nextInt();
                break;
            case "name":
                student1.name = scanner.next();
                break;
            case "sex":
                student1.sex = scanner.next();
                break;
            case "age":
                student1.age = scanner.nextInt();
                break;
            case "grade":
                student1.grade = scanner.next();
                break;
            case "address":
                student1.address = scanner.next();
                break;
            case "phone":
                student1.phone = scanner.nextLong();
                break;
            case "email":
                student1.email = scanner.next();
                break;
        }
    }

    //查看学生信息
    public void check(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+1.查看所有学生信息  2.根据ID查询学生信息  3.根据ID查询学生姓名  4.返回上一层     +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("请选择菜单：");
        int num = scanner.nextInt();
        if (num == 1){
            System.out.println(Arrays.toString(student1s));
            check();
        }else if(num == 2){
            System.out.println("请输入要查询的id：");
            int id = scanner.nextInt();
            for (int i = 0; i < student1s.length; i++) {
                if (id == student1s[i].id){
                    System.out.println(student1s[i]);
                    check();
                }
            }
        }else if (num == 3){
            System.out.println("请输入要查询的id：");
            int id = scanner.nextInt();
            for (int i = 0; i < student1s.length; i++) {
                if (id == student1s[i].id){
                    System.out.println(student1s[i].name);
                    check();
                }
            }
        }else{
            operation();
        }
    }

    // 删除学生信息
    public void delInfo() {
        System.out.println("请输入要删除学生的id：");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        for (int i = 0; i < student1s.length; i++) {
            if (id == student1s[i].id){
                student1s[i] = student1s[student1s.length-1];
                student1s = Arrays.copyOf(student1s, student1s.length-1);
            }
        }
        System.out.println("删除成功！");
        operation();
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}


