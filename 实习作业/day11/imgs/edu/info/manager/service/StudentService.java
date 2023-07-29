package cn.itwanhu.edu.info.manager.service;

import cn.itwanhu.edu.info.manager.dao.OtherStudentDao;
import cn.itwanhu.edu.info.manager.dao.StudentDao;

import cn.itwanhu.edu.info.manager.domain.Student;
import com.sun.org.apache.bcel.internal.generic.ARETURN;
/*
    业务员
*/

public class StudentService {
//    StudentDao std = new StudentDao();
    OtherStudentDao std = new OtherStudentDao();
    //添加学生信息
    public boolean addStudent(Student stu) {
        if(std.ifExist(stu)) return false;
        return std.addStudent(stu);
    }

    public void printMessage() {
        std.printMessage();
    }

    public boolean deleteStudent(Student stu) {
        if(std.ifExist(stu)) return std.deleteStudent(stu);
        return false;
    }

    public boolean alterStudent(Student stu) {
        if(!std.ifExist(stu)) return false;
        return std.alterStudent(stu);
    }
}
