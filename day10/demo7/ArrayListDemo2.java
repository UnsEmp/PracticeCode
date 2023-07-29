package day10.demo7;

import java.util.ArrayList;


/**
 *  其他API（方法）的使用：
 *      add(int index,E element):在集合中指定位置插入指定的元素
 *      E remove(int index):删除指定索引位置的元素，返回被删除的元素
 *      E set(int index,E element):修改指定索引处的元素,返回被修改的元素
 *      E get(int index):获取指定索引处的元素
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> arrayList = new ArrayList<>();

        //添加数据
        arrayList.add("hello");
        arrayList.add("20");
        arrayList.add("java");
        arrayList.add("javaEE");

        System.out.println(arrayList);
        System.out.println("=====================");
        arrayList.add(1,"web");
        System.out.println(arrayList);
        System.out.println("=====================");

        //[hello, web, 20, java, javaEE]
        String element = arrayList.remove(1);
        System.out.println(element);
        System.out.println(arrayList);
        System.out.println("=====================");

        //[hello, 20, java, javaEE]
        String element2 = arrayList.set(1, "javaSE");
        System.out.println(element2);
        System.out.println(arrayList);

        System.out.println("=====================");
        System.out.println(arrayList.get(2));

        System.out.println(arrayList.size());
        //遍历集合
        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            System.out.println(str);
        }
    }
}