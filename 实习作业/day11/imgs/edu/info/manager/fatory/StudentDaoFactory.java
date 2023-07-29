package cn.itwanhu.edu.info.manager.fatory;

/*
    工厂类
*/

import cn.itwanhu.edu.info.manager.dao.OtherStudentDao;

public class StudentDaoFactory {
    //获取集合版本的库管对象
    public static OtherStudentDao getStudentDao() {
        return new OtherStudentDao();
    }
}
