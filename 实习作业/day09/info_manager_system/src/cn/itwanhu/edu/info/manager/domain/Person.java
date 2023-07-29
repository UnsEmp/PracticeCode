package cn.itwanhu.edu.info.manager.domain;

/*
    超类，基类，父类

    继承是将多个类中多个相同的属性和方法抽取到单独的类中，
    那么多个类无需再定义这些共性属性的方法，只要继承这个单独的类
    既可拥有这些属性和方法

    继承的关键字：extends
*/

public class Person {
    private String id;
    private String name;
    private String age;
    private String birthday;

    public Person() {
    }

    public Person(String id, String name, String age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
