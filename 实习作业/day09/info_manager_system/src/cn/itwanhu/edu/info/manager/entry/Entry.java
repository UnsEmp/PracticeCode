package cn.itwanhu.edu.info.manager.entry;

import cn.itwanhu.edu.info.manager.domain.Student;

import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("------------UnsEmp Message Manage System-------------");
            System.out.println("请输入您的选择：1.学生管理 2.老师管理 3.退出");
            String choice = sc.next();
            switch(choice) {
                case "1":
                    System.out.println("学生管理");
                    new StudentController().start();
                    break;
                case "2":
                    System.out.println("老师管理");
                    new TeacherController().start();
                    break;
                case "3":
                    System.out.println("退出");
                    System.exit(0);
                default:
                    System.out.println("输入错误！");
                    break;
            }
        }
    }
}
