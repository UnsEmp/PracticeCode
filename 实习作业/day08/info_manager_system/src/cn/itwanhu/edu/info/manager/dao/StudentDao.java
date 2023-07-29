package cn.itwanhu.edu.info.manager.dao;

/*
    库管
*/

import cn.itwanhu.edu.info.manager.domain.Student;

public class StudentDao {
    //添加学生信息
    private Student[] stus = new Student[100];


    public boolean addStudent (Student stu) {

        int idx = -1;
        for (int i = 0; i < stus.length; ++i) {
            if(stus[i] == null) {
                idx = i;
                break;
            }
        }

        if(idx == -1) {
            //装满了
            return false;
        }

        stus[idx] = stu;
        return true;
    }

    public boolean ifExist(Student stu) {
        for(int i = 0;i < stus.length;++i) {
            if(stus[i] != null && stus[i].getId().equals(stu.getId())) return true;
        }
        return false;
    }

    public void printMessage() {
        System.out.println("id\tname\tage\tbirthday");
        for(int i = 0;i < stus.length;++i) {
            if(stus[i] != null)  System.out.println(stus[i].getId() + "\t" + stus[i].getName() + "\t" + stus[i].getAge() + "\t" + stus[i].getBirthday());
        }
    }

    public boolean deleteStudent(Student stu) {
        for(int i = 0;i < stus.length;++i) {
            if(stus[i] != null && stus[i].getId().equals(stu.getId())) {
                stus[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean alterStudent(Student stu) {
        for(int i = 0;i < stus.length;++i) {
            if(stus[i] != null && stus[i].getId().equals(stu.getId())) {
                stus[i].setId(stu.getId());
                stus[i].setName(stu.getName());
                stus[i].setAge(stu.getAge());
                stus[i].setBirthday(stu.getBirthday());
                return true;
            }
        }
        return false;
    }
}
