package day10.demo7;

/*
    集合和数组的区别:
        相同点:都是容器，可以存储多个数据

    不同点:
        数组的长度是不可变，集台的长度是可变的
        数组可以存储基本类型的引用类型
        集合只能存储引用类型，如果是存储基本类型，需要对基本类型进行包装了包装类] int-->Integerfloat-->Float

    单列（Collection）                                  双列（Map）
    list[可重复]               set[不可重复]               HashMap     TreeMap
    ArrayList   LinkedList      HashSet     TreeSet


*/

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("hello");
        arrayList.add("20");
        System.out.println(arrayList);

        /*
         遍历集台:
            送代器:专用遍历方式 Iterator
            boolean hasNext():断当前位置是否有元素可以被取出
            next(): 获取当前位置的元素，将送代器对象移向下一个索引的位置

            remove():删除元素
        */

//        Iterator<String> iterator = arrayList.iterator(); //获取迭代器对象，通过集合iterator方法
//
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }


        //增强for循环，对迭代器遍历的封装，更加的简洁
        for(String str : arrayList) {
            System.out.println(str);
        }
    }
}
