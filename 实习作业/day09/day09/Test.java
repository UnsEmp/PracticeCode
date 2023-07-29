package day09;


class Employee {
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

    public String showMsg() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", workId='" + workId + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}

class Manager extends Employee{
    String clerk;

    public Manager() {
    }

    public Manager(String name, String workId, String dept, String clerk) {
        super(name, workId, dept);
        this.clerk = clerk;
    }



}

public class Test {
    public static void main(String[] args) {

    }
}
