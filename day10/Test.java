package day10;


abstract class Employee {
    private String name;
    private String workId;
    private String dept;

    public Employee() {
    }

    public Employee(String name, String workId, String dept) {
        this.name = name;
        this.workId = workId;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public abstract void showMsg();
}

class Manager extends Employee{
    String clerk;

    public Manager() {
    }

    public Manager(String name, String workId, String dept, String clerk) {
        super(name, workId, dept);
        this.clerk = clerk;
    }



    @Override
    public void showMsg() {
        System.out.println(this.getName() + " " + this.getWorkId() + " " + this.getDept() + " " + clerk);
    }
}

class Clerk extends Employee {
    String manager;

    public Clerk(String manager) {
        this.manager = manager;
    }

    public Clerk(String name, String workId, String dept, String manager) {
        super(name, workId, dept);
        this.manager = manager;
    }

    @Override
    public void showMsg() {
        System.out.println(this.getName() + " " + this.getWorkId() + " " + this.getDept() + " " + manager);
    }
}

public class Test {
    public static void main(String[] args) {
        Manager m1 = new Manager("m001", "zxq", "sale", "lxl");
        Clerk c1 = new Clerk("c001", "lxl", "sale", "zxq");
        m1.showMsg();
        c1.showMsg();
    }
}

