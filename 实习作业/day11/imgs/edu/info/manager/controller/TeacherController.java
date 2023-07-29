package cn.itwanhu.edu.info.manager.controller;

/*
    客服接待(Teacher)
*/


import cn.itwanhu.edu.info.manager.domain.Student;
import cn.itwanhu.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class TeacherController {
    Scanner sc = new Scanner(System.in);
    StudentService service = new StudentService();

    public void start() {
        Scanner sc = new Scanner(System.in);


        studentLoop:
        while(true) {
            System.out.println("----------------Student Manage System-------------------");
            System.out.println("-----------------请输入您的选择: 1.添加老师信息 2.删除老师信息 3.修改老师信息 4.查找老师 5.exit --------------");
            String choice = sc.next();
            switch(choice) {
                case "1":
                    System.out.println("1.添加老师信息");
                    addStudent();
                    break;
                case "2":
                    System.out.println("2.删除老师信息");
                    deleteStudent();
                    break;
                case "3":
                    System.out.println("3.修改老师信息");
                    alterStudent();
                    break;
                case "4":
                    System.out.println("4.查看老师信息");
                    checkStudent();
                    break;
                case "5":
                    break studentLoop;
            }
        }
    }

    public void alterStudent() {
        System.out.println("请输入要修改老师的id");
        String id = sc.next();
        System.out.println("请输入要修改老师的姓名");
        String name = sc.next();
        System.out.println("请输入要修改老师的年龄");
        String age = sc.next();
        System.out.println("请输入要修改老师的生日");
        String birthday = sc.next();

        Student st = new Student(id, name, age, birthday);

        if(service.alterStudent(st)) System.out.println("修改成功！");
        else System.out.println("修改失败！");
    }

    private void deleteStudent() {
        System.out.println("请输入要删除老师的id");
        String id = sc.next();
        System.out.println("请输入要删除老师的姓名");
        String name = sc.next();
        System.out.println("请输入要删除老师的年龄");
        String age = sc.next();
        System.out.println("请输入要删除老师的生日");
        String birthday = sc.next();

        Student st = new Student(id, name, age, birthday);

        if(service.deleteStudent(st)) System.out.println("删除成功！");
        else System.out.println("删除失败！");
    }

    private void checkStudent() {
        service.printMessage();
    }

    private void addStudent() {
        System.out.println("请输入老师的id");
        String id = sc.next();
        System.out.println("请输入老师的姓名");
        String name = sc.next();
        System.out.println("请输入老师的年龄");
        String age = sc.next();
        System.out.println("请输入老师的生日");
        String birthday = sc.next();

        //封装成老师对象
        Student st = new Student(id, name, age, birthday);

        //将老师对象，交给业务员进行存储处理
//        StudentService service = new StudentService();
        boolean result = service.addStudent(st);

        if(result) System.out.println("添加成功！");
        else System.out.println("添加失败！");
    }
}
