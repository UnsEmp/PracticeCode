package cn.itwanhu.edu.info.manager.dao;

import cn.itwanhu.edu.info.manager.domain.Student;

public abstract class BaseStudentDao {
    //添加学生信息
    public abstract boolean addStudent (Student stu);

    public abstract boolean ifExist(Student stu);

    public abstract void printMessage();

    public abstract boolean deleteStudent(Student stu);

    public abstract boolean alterStudent(Student stu);
}
