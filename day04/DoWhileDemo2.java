package day04;

/**
 * do...while特点：
 *      do...while循环至少执行一次循环体，原因是do..while循环是从上往下执行的，而for循环、while循环必须先判断条件是否成立
 *      然后决定是否执行循环体语句
 *
 *  优先考虑for循环，其次考虑while循环，最后考虑do...while循环
 */
public class DoWhileDemo2 {
    public static void main(String[] args) {
        int x = 3;
        while (x < 3){
            System.out.println("Python");
            x++;
        }

        System.out.println("=========================");
        int y =3;
        do {
            System.out.println("Python");
            y++;
        }while (y < 3);
    }
}
