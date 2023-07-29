package day08;

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setAge(18);
        t.setName("zmh");
        t.setSex("man");
        System.out.println(t.toString());

        Teacher t1 = new Teacher("zxy", 18, "women");
        System.out.println(t1.toString());
    }
}
