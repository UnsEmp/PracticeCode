package cn.itwanhu.edu.info.manager.service;

import cn.itwanhu.edu.info.manager.dao.StudentDao;
import cn.itwanhu.edu.info.manager.domain.Student;
/*
    业务员
*/

public class StudentService {
    StudentDao std = new StudentDao();

    //添加学生信息
    public boolean addStudent(Student stu) {
        if(std.ifExist(stu)) return false;
        return std.addStudent(stu);
    }

    public void printMessage() {
        std.printMessage();
    }

    public boolean deleteStudent(Student stu) {
        if(!std.ifExist(stu)) return false;
        return std.deleteStudent(stu);
    }

    public boolean alterStudent(Student stu) {
        if(!std.ifExist(stu)) return false;
        return std.alterStudent(stu);
    }
}
