package cn.itwanhu.edu.info.manager.dao;

import cn.itwanhu.edu.info.manager.domain.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OtherStudentDao extends BaseStudentDao {
    //添加学生信息
//    static private Student[] stus = new Student[100]; // 数组版本
    static private ArrayList<Student> stus = new ArrayList<>(); // 集合版本

    static {
//        stus[0] = new Student("wanhao001", "zs", "23", "1996");
//        stus[1] = new Student("wanhao002", "ls", "20", "1998");
        stus.add(new Student("wanhao001", "zs", "23", "1996"));
        stus.add(new Student("wanhao002", "ls", "20", "1998"));
    }

    public boolean addStudent (Student stu) {

//        int idx = -1;
//        for (int i = 0; i < stus.size(); ++i) {
//            if(stus[i] == null) {
//                idx = i;
//                break;
//            }
//        }
//
//        if(idx == -1) {
//            //装满了
//            return false;
//        }
//
//        stus[idx] = stu;
        stus.add(stu);
        return true;
    }

    public boolean ifExist(Student stu) {
        for(Student st : stus) {
            if(st.getId().equals(stu.getId())) return true;
        }
        return false;
    }

    public void printMessage() {
        System.out.println("id\tname\tage\tbirthday");
        for(int i = 0;i < stus.size();++i) {
            System.out.println(stus.get(i).getId() + "\t" + stus.get(i).getName() + "\t" + stus.get(i).getAge() + "\t" + stus.get(i).getBirthday());
        }
    }

    public boolean deleteStudent(Student stu) {
//        for(int i = 0;i < stus.size();++i) {
//            if(stus.get(i).getId().equals(stu.getId())) {
//                stus[i] = null;
//                return true;
//            }
//        }

        for(Student st : stus) {
            if(st.getId().equals(stu.getId())) {
                stus.remove(st);
                return true;
            }
        }
        return false;
//        return stus.remove(stu);
    }

    public boolean alterStudent(Student stu) {
        for(int i = 0;i < stus.size();++i) {
            if(stus.get(i).getId().equals(stu.getId())) {
                stus.get(i).setId(stu.getId());
                stus.get(i).setName(stu.getName());
                stus.get(i).setAge(stu.getAge());
                stus.get(i).setBirthday(stu.getBirthday());
                return true;
            }
        }
        return false;
    }

}



