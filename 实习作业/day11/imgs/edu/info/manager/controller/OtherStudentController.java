package cn.itwanhu.edu.info.manager.controller;

import cn.itwanhu.edu.info.manager.domain.Student;
import cn.itwanhu.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class OtherStudentController {
    Scanner sc = new Scanner(System.in);
    StudentService service = new StudentService();

    public void start() {
        Scanner sc = new Scanner(System.in);


        studentLoop:
        while(true) {
            System.out.println("----------------Student Manage System-------------------");
            System.out.println("-----------------请输入您的选择: 1.添加学生信息 2.删除学生信息 3.修改学生信息 4.查找学生 5.exit --------------");
            String choice = sc.next();
            switch(choice) {
                case "1":
                    System.out.println("1.添加学生信息");
                    addStudent();
                    break;
                case "2":
                    System.out.println("2.删除学生信息");
                    deleteStudent();
                    break;
                case "3":
                    System.out.println("3.修改学生信息");
                    alterStudent();
                    break;
                case "4":
                    System.out.println("4.查看学生信息");
                    checkStudent();
                    break;
                case "5":
                    break studentLoop;
            }
        }
    }

    public void alterStudent() {

        Student st = inputStudent();

        if(service.alterStudent(st)) System.out.println("修改成功！");
        else System.out.println("修改失败！");
    }

    private void deleteStudent() {
        Student st = inputStudent();

        if(service.deleteStudent(st)) System.out.println("删除成功！");
        else System.out.println("删除失败！");
    }

    private void checkStudent() {
        service.printMessage();
    }

    private void addStudent() {

        //封装成学生对象
        Student st = inputStudent();


        //将学生对象，交给业务员进行存储处理
//        StudentService service = new StudentService();
        boolean result = service.addStudent(st);

        if(result) System.out.println("添加成功！");
        else System.out.println("添加失败！");
    }

    //键盘录入学生id
    private String inputStudentId() {
        System.out.println("请输入学生的id");
        String id = sc.next();
        return id;
    }

    //键盘录入学生信息
    public Student inputStudent() {
        System.out.println("请输入学生的id");
        String id = sc.next();
        System.out.println("请输入学生的姓名");
        String name = sc.next();
        System.out.println("请输入学生的年龄");
        String age = sc.next();
        System.out.println("请输入学生的生日");
        String birthday = sc.next();

        Student st = new Student(id, name, age, birthday);
        return st;
    }
}





