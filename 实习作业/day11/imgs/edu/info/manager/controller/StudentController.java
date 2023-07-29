package cn.itwanhu.edu.info.manager.controller;

/*
    客服接待
*/


import cn.itwanhu.edu.info.manager.domain.Student;
import cn.itwanhu.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController extends BaseStudentController {

    //键盘录入学生信息
    @Override
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
